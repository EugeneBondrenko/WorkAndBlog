package workandblog.util;


import org.springframework.web.multipart.MultipartFile;
import workandblog.enums.MainPathEnum;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class SaveFile {

//    private MultipartFile[] files;
       private MultipartFile files;

//    public SaveFile(MultipartFile[] files) {
//        this.files = files;
//    }

    public SaveFile(MultipartFile files) {
        this.files = files;
    }


    public ArrayList<String> saveFileAndGetNames() {

        ArrayList<String> fileNames = new ArrayList<>();

//        for (int i = 0; i < this.files.length; i++) {
//            MultipartFile file = this.files[i];

        MultipartFile file = this.files;
            String originalFileName = file.getOriginalFilename();


            System.out.println("originalFileName : " + originalFileName);


            String fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
            String name = (java.util.UUID.randomUUID() + fileExtension);

            System.out.println("name : " + name);

            fileNames.add(name);
            try {
                byte[] bytes = file.getBytes();
                File dir = new File(MainPathEnum.mainPath.getValue());
                dir.setReadable(true, false);
                dir.setExecutable(true, false);
                dir.setWritable(true, false);
                if (!dir.exists()) {
                    dir.mkdirs();
                    System.out.println("==========CREATE DIR" + dir.getAbsolutePath());
                }
                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath() + "/" + name);

                serverFile.setReadable(true, false);
                serverFile.setExecutable(true, false);
                serverFile.setWritable(true, false);

                serverFile.createNewFile();
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
       // }
        return fileNames;
    }

}