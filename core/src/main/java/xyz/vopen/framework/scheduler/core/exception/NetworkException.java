package xyz.vopen.framework.scheduler.core.exception;

import javax.validation.constraints.NotNull;

/**
 * {@link NetworkException}
 *
 * @author <a href="mailto:siran0611@gmail.com">Elias.Yao</a>
 * @version ${project.version} - 2020/9/29
 */
public class NetworkException extends RuntimeException {
  static final long serialVersionUID = -7034897190745766939L;

  public NetworkException() {
    super();
  }

  public NetworkException(@NotNull String message) {
    super(message);
  }

  public NetworkException(@NotNull Throwable cause) {
    super(cause);
  }

  public NetworkException(String message, Throwable cause) {
    super(message, cause);
  }
}