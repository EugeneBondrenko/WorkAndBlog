package workandblog.logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ControllerLogger {

    private Logger logger = LogManager.getLogger(ControllerLogger.class);

    @Pointcut("execution(* workandblog.util.SaveFile.saveFileAndGetNames(..))")
    private void start() {
        System.out.println("Aspekts");
    }

    @Before("start()")
    private void beforeStart() {
        System.out.println("Logging");
        logger.info("Start web ");
    }

    @Around("start() && @annotation(workandblog.annotations.ShowTest)")
    public void showTest(){
        System.out.println("Logging");
        logger.info("Start web ");
    }
}
