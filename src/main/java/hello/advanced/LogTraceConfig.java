package hello.advanced;


import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {


    @Bean
    public LogTrace logTrace(){
        return new ThreadLocalLogTrace(); //싱글톤으로 등록
    }
}
