package workandblog.controller.saveFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import workandblog.enums.MainPathEnum;
import workandblog.service.ContactService;
import workandblog.util.SaveFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLConnection;
import java.nio.charset.Charset;

@Controller
public class AppControllerSaveFile {

    @Autowired
    private ContactService contactService;

    private Long userId;
    private String contactName , contactSurName ,number ;


    private String originalFileName;
    private String fileName;



    @RequestMapping(value = "/show-save-new-file-page", method = RequestMethod.GET)
    public ModelAndView showSaveFilePage() {
        ModelAndView saveFilePage = new ModelAndView("saveFilePage");
        return saveFilePage;
    }


    @RequestMapping(value = "/save-new-contact", method = RequestMethod.POST)
    public ModelAndView saveNewContact(){
        userId = new  Long(1);
        contactName = new String("Djon");
        contactSurName = new String("Djony");
        number = new String("0639332640");
        String contactInfo = new String("Djony Good boys");

        contactService.create(userId, contactName, contactSurName, number, contactInfo, originalFileName, fileName);

        return new ModelAndView("redirect:/show-save-new-file-page");
    }

    @RequestMapping(value = "/save-new-file", method = RequestMethod.POST)
    public ModelAndView saveNewFile(@RequestParam("filePicture[]") MultipartFile files) {

        SaveFile saveFile = new SaveFile(files);


        saveFile.saveFileAndGetNames();
//        System.out.println("save : " + saveFile.saveFileAndGetNames());

        MultipartFile file = files;
        String name = file.getOriginalFilename();
        System.out.println("original : " + name);
        originalFileName = name;
        return  new ModelAndView("redirect:/show-save-new-file-page"); //
    }


    @RequestMapping(value = "/show-image/{filename}/", method = RequestMethod.GET)
    public void downloadFile(HttpServletResponse response, @PathVariable String filename) throws IOException {


        String EXTERNAL_FILE_PATH = MainPathEnum.mainPath  + filename;

        fileName = filename;
        System.out.println("filename : "+filename);
        System.out.println(EXTERNAL_FILE_PATH);

        File file = new File(EXTERNAL_FILE_PATH);


        if (!file.exists()) {
            String errorMessage = "Sorry. The file you are looking for does not exist";
            System.out.println(errorMessage);
            OutputStream outputStream = response.getOutputStream();
            outputStream.write(errorMessage.getBytes(Charset.forName("UTF-8")));
            outputStream.close();
            return;
        }


        String mimeType = URLConnection.guessContentTypeFromName(file.getName());
        if (mimeType == null) {
            System.out.println("mimetype is not detectable, will take default");
            mimeType = "application/octet-stream";
        }

        System.out.println("mimetype : " + mimeType);
        System.out.println("-------------------------------------------" );
        System.out.println();

        response.setContentType(mimeType);

        /* "Content-Disposition : inline" will show viewable types [like images/text/pdf/anything viewable by browser] right on browser
            while others(zip e.g) will be directly downloaded [may provide save as popup, based on your browser setting.]*/
        response.setHeader("Content-Disposition : attachment", String.format("inline; filename=\"" + file.getName() + "\""));


        /* "Content-Disposition : attachment" will be directly download, may provide save as popup, based on your browser setting*/
        //response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));

        response.setContentLength((int) file.length());

        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

        //Copy bytes from source to destination(outputstream in this example), closes both streams.
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

}



