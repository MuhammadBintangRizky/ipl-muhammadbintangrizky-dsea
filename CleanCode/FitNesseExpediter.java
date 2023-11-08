package CleanCode;

import java.io.InputStream;
import java.net.Socket;

public class FitNesseExpediter {
    private   Socket            socket;
    private   InputStream       input;
    private   OutputStream      output;
    private   Request           request;
    private   Response          response;
    private   FitNessContext    context;
    protected long              requestParsingTimeLimit;
    private   long              requestProgress;
    private   long              requestParsingDeadline;
    private   boolean           hassError;

}
