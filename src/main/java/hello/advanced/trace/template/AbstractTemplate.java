package hello.advanced.trace.template;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.logtrace.LogTrace;

public abstract class AbstractTemplate<T> {

    private final LogTrace trace;


    protected AbstractTemplate(LogTrace trace) {
        this.trace = trace;
    }

    public T excute(String message){
        TraceStatus status = null;

        try{
            status = trace.begin(message);

            T result = call();

            trace.end(status);
            return result;
        }catch (Exception e){
            trace.exception(status, e);
            throw e;
        }
    }

    protected abstract T call();
}
