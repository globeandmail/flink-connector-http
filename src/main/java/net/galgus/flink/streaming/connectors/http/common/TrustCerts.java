package net.galgus.flink.streaming.connectors.http.common;

import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class TrustCerts {
    private javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[]{
            new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
    };

    public javax.net.ssl.TrustManager[] build() {
        return trustAllCerts;
    }
}
