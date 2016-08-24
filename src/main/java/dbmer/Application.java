package dbmer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动入口
 * Created by fuwb on 16/7/11.
 */

@SpringBootApplication
public class Application {
    private static Log logger = LogFactory.getLog(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


}

