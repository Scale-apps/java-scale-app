package web.utils;

import io.javalin.http.Handler;
import io.javalin.http.HandlerType;
import org.jetbrains.annotations.NotNull;
import web.Routes;

public class RouteMapping {
  public HandlerType method;
  public String url;
  public Handler handler;

  public RouteMapping(@NotNull HandlerType method, @NotNull String url, @NotNull Handler handler) {
    this.method = method;
    this.url = url;
    this.handler = handler;
  }

  public RouteMapping(
      @NotNull HandlerType method,
      @NotNull UiRouterMapping routerRouteConfig,
      @NotNull Handler handler) {
    this.method = method;
    this.url = routerRouteConfig.serverPath;
    this.handler = handler;
    Routes.spaRoutes.add(routerRouteConfig);
  }
}