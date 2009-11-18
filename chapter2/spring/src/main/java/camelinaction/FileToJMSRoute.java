/**
 * 
 */
package camelinaction;

import org.apache.camel.builder.RouteBuilder;

public class FileToJMSRoute extends RouteBuilder {
    public void configure() {
        from("ftp://riderautoparts.com/orders?username=rider&password=secret").to("jms:incomingOrders");
    }
}