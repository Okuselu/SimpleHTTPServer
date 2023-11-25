/*package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(9085),0);
        server.createContext("/", new Handler("/"));
        server.createContext("/About-us", new Handler("/About-us"));
        server.createContext("/Services", new Handler("/Services"));
        server.createContext("/Contact Us", new Handler("/Contact Us"));
        server.setExecutor(null);
        server.start();

    }
    static class Handler implements HttpHandler {
        private String path;

        public Handler(String path) {
            this.path = path;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response;
            System.out.println("This is the current path "+path);
            if (Objects.equals(path.length(), 1)){
                response = "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>HomePage</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<img src="+"https://img.freepik.com/free-psd/black-friday-tag-icon-isolated-3d-render-illustration_47987-11755.jpg?w=996&t=st=1700651312~exp=1700651912~hmac=dc0ff3f3f6da086798677c19dffa585462398b123dcc0015448493a895cb12ad />"+
                        "<br>"+
                        "<a href = "+"/about-us>About Us</a>\n"+
                        "<a href = "+"/>Home page</a>\n"+
                        "<h1> Home page</h1>\n" +
                        "</body>\n" +
                        "</html>";
            } else if (path.contains("/about-us")) {
                response = "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>HomePage</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<a href = "+"/>Home page</a>\n"+
                        "<a href = "+"/about-us>About Us</a>\n"+
                        "<h1> About Us Page</h1>\n" +
                        "<br>"+
                        "<img src="+"https://images.freeimages.com/variants/DVg6TTGcRiJSdhEbY212DbAu/f4a36f6589a0e50e702740b15352bc00e4bfaf6f58bd4db850e167794d05993d />"+
                        "</body>\n" +
                        "</html>";
            }
            else{
                response =  "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>HomePage</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<h1> 404 Page Not Found</h1>\n" +
                        "<a href = "+"localhost"+":9085/about-us>About Us</a>\n"+
                        "<a href = "+"localhost"+":9085/>Home page</a>\n"+
                        "<a href = "+"localhost"+":9085/>Services</a>\n"+
                        "<a href = "+"localHost"+":9085/>Contact Us</a>\n"+
                        "</body>\n" +
                        "</html>";
            }



            exchange.getResponseHeaders().set("Content-type","text/html");
            exchange.sendResponseHeaders(200, response.length());
            try(OutputStream outputStream = exchange.getResponseBody()){
                outputStream.write(response.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

}*/
package org.example;

        import com.sun.net.httpserver.HttpExchange;
        import com.sun.net.httpserver.HttpHandler;
        import com.sun.net.httpserver.HttpServer;

        import java.io.IOException;
        import java.io.OutputStream;
        import java.net.InetSocketAddress;
        import java.nio.charset.StandardCharsets;
        import java.util.Objects;

public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(9085), 0);
        server.createContext("/", new Handler("/"));
        server.createContext("/about-us", new Handler("/about-us"));
        server.createContext("/Services", new Handler("/Services"));
        server.createContext("/Contact Us", new Handler("/Contact Us"));
        server.setExecutor(null);
        server.start();

    }

    static class Handler implements HttpHandler {
        private String path;

        public Handler(String path) {
            this.path = path;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response;
            System.out.println("This is the current path " + path);

            switch (path) {
                case "/":
                    response = "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Welcome to our website</title>\n" +
                            "    <style>\n" +
                            "        body {\n" +
                            "            font-family: 'Montserrat', sans-serif;\n" +
                            "            font-size: 80px;\n" +
                            "        }\n" +
                            "        .container {\n" +
                            "            display: flex;\n" +
                            "            flex-direction: column;\n" +
                            "            align-items: center;\n" +
                            "        }\n" +
                           /* "        .title {\n" +
                            "            font-size: 30px;\n" +*/
                            "        .links {\n" +
                            "            display: flex;\n" +
                            "            flex direction: row;\n" +
                            "        }\n" +
                            "        .links a {\n" +
                            "            margin-right: 10px;\n" +
                            "        .image {\n" +
                            "            margin-bottom: 10px;\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&display=swap\" rel=\"stylesheet\">\n" +
                            "</head>\n" +
                            " <body>\n" +
                            "<div class=\"container\">\n" +
                            "    <h1>Home page</h1>\n" +
                            "    <p>we are here for you</p>\n" +
                            "    <div class = \"links\"> " +
                            "        <a href=\"/about-us\">About Us</a>\n" +
                            "        <a href=\"/Services\">Services</a>\n" +
                            "        <a href=\"/Contact Us\">Contact Us</a>\n" +
                            "    </div>\n" +
                            "    <img class=\"image\" src=\"https://img.freepik.com/free-psd/black-friday-tag-icon-isolated-3d-render-illustration_47987-11755.jpg?w=996&t=st=1700651312~exp=1700651912~hmac=dc0ff3f3f6da086798677c19dffa585462398b123dcc0015448493a895cb12ad\"/>\n" +
                            "    <br>\n" +
                            "</div>\n" +
                            "</body>\n" +
                            "</html>";

                    /*response = "<!DOCTYPE html>\n" +
                              "<html lang=\"en\">\n" +
                              "<head>\n" +
                              "    <meta charset=\"UTF-8\">\n" +
                              "    <title>HomePage</title>\n" +
                              "    <style>\n" +
                              "        body {\n" +
                              "            font-size: 20px;\n" +
                              "        }\n" +
                              "        .container {\n" +
                              "            display: flex;\n" +
                              "            flex-direction: column;\n" +
                              "            align-items: center;\n" +
                              "        }\n" +
                              "        .image {\n" +
                              "            margin-bottom: 10px;\n" +
                              "        }\n" +
                              "    </style>\n" +
                              "</head>\n" +
                              "<body>\n" +
                              "<div class=\"container\">\n" +
                              "    <h1>Home page</h1>\n" +
                              "    <p>Welcome to our website!</p>\n" +
                              "    <img class=\"image\" src=\"https://img.freepik.com/free-psd/black-friday-tag-icon-isolated-3d-render-illustration_47987-11755.jpg?w=996&t=st=1700651312~exp=1700651912~hmac=dc0ff3f3f6da086798677c19dffa585462398b123dcc0015448493a895cb12ad\"/>\n" +
                              "    <br>\n" +
                              "    <a href=\"/about-us\">About Us</a>\n" +
                              "    <a href=\"/Services\">Services</a>\n" +
                              "    <a href=\"/Contact Us\">Contact Us</a>\n" +
                              "</div>\n" +
                              "</body>\n" +
                              "</html>"; */

                    break;

                case "/about-us":
                    response = "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>About Us</title>\n" +
                            "    <style>\n" +
                            "        body {\n" +
                            "            font-size: 20px;\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "<a href=\"/\">Home page</a>\n" +
                            "<a href=\"/Services\">Services</a>\n" +
                            "<a href=\"/Contact Us\">Contact Us</a>\n" +
                            "<h1> About Us Page</h1>\n" +
                            "<br>\n" +
                            "<img src=\"https://images.freeimages.com/variants/DVg6TTGcRiJSdhEbY212DbAu/f4a36f6589a0e50e702740b15352bc00e4bfaf6f58bd4db850e167794d05993d\"/>\n" +
                            "</body>\n" +
                            "</html>";
                    break;

                case "/Services":
                    response = "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Services</title>\n" +
                            "    <style>\n" +
                            "        body {\n" +
                            "            font-size: 20px;\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "<a href=\"/\">Home page</a>\n" +
                            "<a href=\"/about-us\">About Us</a>\n" +
                            "<a href=\"/Contact Us\">Contact Us</a>\n" +
                            "<h1> Services Page</h1>\n" +
                            "<br>\n" +
                            "<p>Our services:</p>\n" +
                            "<ul>\n" +
                            "    <li>Service 1</li>\n" +
                            "    <li>Service 2</li>\n" +
                            "    <li>Service 3</li>\n" +
                            "</ul>\n" +
                            "</body>\n" +
                            "</html>";
                    break;

                case "/Contact Us":
                    response = "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Contact Us</title>\n" +
                            "    <style>\n" +
                            "        body {\n" +
                            "            font-size: 20px;\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "<a href=\"/\">Home page</a>\n" +
                            "<a href=\"/about-us\">About Us</a>\n" +
                            "<a href=\"/Services\">Services</a>\n" +
                            "<h1> Contact Us Page</h1>\n" +
                            "<br>\n" +
                            "<p>Contact information:</p>\n" +
                            "<ul>\n" +
                            "    <li>Email: contact@example.com</li>\n" +
                            "    <li>Phone: 123-456-7890</li>\n" +
                            "</ul>\n" +
                            "</body>\n" +
                            "</html>";
                    break;

                default:
                    response = "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>404 Page Not Found</title>\n" +
                            "    <style>\n" +
                            "        body {\n" +
                            "            font-size: 20px;\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "<h1>404 Page Not Found</h1>\n" +
                            "<a href=\"/\">Home page</a>\n" +
                            "<a href=\"/about-us\">About Us</a>\n" +
                            "<a href=\"/Services\">Services</a>\n" +
                            "<a href=\"/Contact Us\">Contact Us</a>\n" +
                            "</body>\n" +
                            "</html>";
                    break;
            }

            exchange.getResponseHeaders().set("Content-type", "text/html");
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream outputStream = exchange.getResponseBody()) {
                outputStream.write(response.getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}

