package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String status);
    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
