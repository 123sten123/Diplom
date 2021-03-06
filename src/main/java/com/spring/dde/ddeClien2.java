package com.spring.dde;

import com.pretty_tools.dde.DDEException;
import com.pretty_tools.dde.DDEMLException;
import com.pretty_tools.dde.client.DDEClientConversation;
import com.pretty_tools.dde.client.DDEClientEventListener;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Степан1 on 10.04.2018.
 */
public class ddeClien2 extends Thread  {

    public void run() {
        {
            final String SERVICE = "DDERouter";
            final String TOPIC = "Quotes";
            final String ITEM = "BID_SBER";

            try {
                // event to wait disconnection
                final CountDownLatch eventDisconnect = new CountDownLatch(1);

                // DDE client
                final DDEClientConversation conversation = new DDEClientConversation();
                // We can use UNICODE format if server prefers it
                //conversation.setTextFormat(ClipboardFormat.CF_UNICODETEXT);

                conversation.setEventListener(new DDEClientEventListener() {
                    public void onDisconnect() {
                        System.out.println("onDisconnect()");
                        eventDisconnect.countDown();
                    }

                    public void onItemChanged(String topic, String item, String data) {
                        System.out.println("onItemChanged(" + topic + "," + item + "," + data + ")");
                        try {
                            if ("stop".equalsIgnoreCase(data))
                                conversation.stopAdvice(item);
                        } catch (DDEException e) {
                            System.out.println("Exception: " + e);
                        }
                    }
                });

                System.out.println("Connecting..." +"\n"+SERVICE);
                conversation.connect(SERVICE, TOPIC);
                conversation.startAdvice(ITEM);

                System.out.println("Waiting event...");
                eventDisconnect.await();
                System.out.println("Disconnecting...");
                conversation.disconnect();
                System.out.println("Exit from thread");
            } catch (DDEMLException e) {
                System.out.println("DDEMLException: 0x" + Integer.toHexString(e.getErrorCode()) + " " + e.getMessage());
            } catch (DDEException e) {
                System.out.println("DDEClientException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}

