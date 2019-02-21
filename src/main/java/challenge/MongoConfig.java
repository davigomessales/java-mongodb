//package challenge;
//
//import com.mongodb.Mongo;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
//import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
//import org.springframework.data.mongodb.core.mapping.event.LoggingEventListener;
//import org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class MongoConfig extends AbstractMongoConfiguration {
//
//    @Bean
//    public Mongo mongo() throws Exception {
//        return new Mongo("localhost");
//    }
//
//    @Override
//    public String getDatabaseName() {
//        return "database";
//    }
//
//    @Override
//    public String getMappingBasePackage() {
//        return "com.bigbank.domain";
//    }
//
//    // the following are optional
//
//    @Override
//    protected void afterMappingMongoConverterCreation(MappingMongoConverter converter) {
//        Set<Converter<?, ?>> converterList = new HashSet<Converter<?, ?>>();
//        converterList.add(new org.springframework.data.mongodb
//        converterList.add(new org.springframework.data.mongodb.test.PersonReadConverter());
//        converterList.add(new org.springframework.data.mongodb.test.PersonWriteConverter());
//        converter.setCustomConverters(converterList);
//    }
//
//    @Bean
//    public LoggingEventListener<MongoMappingEvent> mappingEventsListener() {
//        return new LoggingEventListener<MongoMappingEvent>();
//    }
//}
