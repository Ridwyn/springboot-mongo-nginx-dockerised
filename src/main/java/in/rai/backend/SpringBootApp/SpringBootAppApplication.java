package in.rai.backend.SpringBootApp;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

@SpringBootApplication
@Slf4j
public class SpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppApplication.class, args);
    }

    @Bean
    public MongoClientFactoryBean mongo(@Value("${custom.uri}") String uri) throws Exception {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        ConnectionString conn = new ConnectionString(uri);
        mongo.setConnectionString(conn);
        log.info(uri);

        MongoClient client = MongoClients.create(conn);
//                mongo.getObject();
        client.listDatabaseNames()
                .forEach(System.out::println);
        return mongo;
    }


}
