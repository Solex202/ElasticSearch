//package com.example.demo.config;
//
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ElasticSearchConfiguration{
//    @Bean
//    public RestHighLevelClient elasticsearchClient() {
//        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("localhost:9200")
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
//}
