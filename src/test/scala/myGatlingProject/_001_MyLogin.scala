package myGatlingProject
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class _001_MyLogin extends Simulation{


  val httpProtocol = http
    .baseUrl("https://www.google-analytics.com")
    .inferHtmlResources()
    .doNotTrackHeader("1")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36")

  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "none",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_1 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "style",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_2 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_3 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_4 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "font",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_10 = Map(
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_11 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-newrelic-id" -> "UwICVF5ACQIFVllRBAM=")

  val headers_16 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-IN,en;q=0.9",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_29 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_56 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "iframe",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1")

  val headers_76 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_90 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "content-type" -> "text/plain",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_127 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-location" -> "https://www.linio.cl/",
    "x-newrelic-id" -> "UwICVF5ACQIFVllRBAM=",
    "x-referrer" -> "",
    "x-xsrf-token" -> "null")

  val headers_134 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "content-type" -> "text/plain;charset=UTF-8",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_158 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-IN,en;q=0.9",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_248 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "content-type" -> "text/plain;charset=UTF-8",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_249 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_256 = Map(
    "Origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_259 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_315 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-IN,en;q=0.9",
    "Origin" -> "https://www.linio.cl",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site",
    "content-type" -> "text/plain",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_322 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_471 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "iframe",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1")

  val headers_475 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-location" -> "https://www.linio.cl/",
    "x-newrelic-id" -> "UwICVF5ACQIFVllRBAM=",
    "x-referrer" -> "https://www.linio.cl/account/login",
    "x-xsrf-token" -> "2dad4eb5c317b2a73ee57a.NYIwRNhRAQnaPpURGkihTIvreI-BG7FLn4ZpumDByqw.b_V3HKghVHOSWs0kfCbRAtuzQe7ZcMcx0fUuzAmTifMG7Wkg7idvap583A")

  val uri01 = "https://bam-cell.nr-data.net"
  val uri02 = "https://nova.collect.igodigital.com/c2/520000417/track_page_view"
  val uri03 = "https://s3.amazonaws.com/fms-live"
  val uri04 = "https://cdn.mndtrk.com/aud/clientjs/826.js"
  val uri05 = "https://bid.g.doubleclick.net/xbbe/pixel"
  val uri06 = "https://onesignal.com"
  val uri07 = "https://cdn.dynamicyield.com"
  val uri08 = "https://js.smct.io/e/events-1.4.8.min.js"
  val uri09 = "https://assets.linio.com"
  val uri10 = "https://www.linio.cl"
  val uri11 = "https://static.criteo.net/js/ld/ld.js"
  val uri12 = "https://connect.facebook.net"
  val uri13 = "https://api.segment.io/v1"
  val uri15 = "https://ck.solocpm.com/rtb/google/cookiematch.aspx"
  val uri16 = "https://www.facebook.com"
  val uri17 = "https://us.widget.mb-srv.com/load.js.gz"
  val uri18 = "https://sslwidget.criteo.com/event"
  val uri19 = "https://img.onesignal.com/permanent/a9a3f1f4-a3df-47a5-8c46-709e2c33e356"
  val uri20 = "https://520000417.collect.igodigital.com/collect.js"
  val uri21 = "https://widget.us.criteo.com/event"
  val uri22 = "https://st.dynamicyield.com/st"
  val uri23 = "https://async-px.dynamicyield.com"
  val uri24 = "https://cdn.segment.com/analytics.js/v1/Gj5Ecj8OJO8gJynkYHm5FcweCIgRgBrU/analytics.min.js"
  val uri25 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion"
  val uri26 = "https://cm.g.doubleclick.net/pixel"
  val uri27 = "https://www.googletagmanager.com/gtm.js"
  val uri28 = "https://appleid.cdn-apple.com/appleauth/static/jsapi/appleid/1/en_US/appleid.auth.js"
  val uri29 = "https://www.google.com/pagead"
  val uri30 = "https://www.google.co.in/pagead"
  val uri31 = "https://js-agent.newrelic.com/nr-1210.min.js"
  val uri32 = "https://us.creativecdn.com"
  val uri33 = "https://smct.co"
  val uri34 = "https://www.mainadv.com/Visibility/Rtgdir2-min.js"
  val uri35 = "https://dynamic-yield.linio.com/api/scripts/8767679"
  val uri36 = "https://cdn.scarabresearch.com/js/1967E09C3F081A3A/scarab-v2.js"
  val uri37 = "https://i.linio.com"
  val uri38 = "https://apis.google.com"
  val uri39 = "https://www.googleadservices.com/pagead"
  val uri40 = "https://cdn.onesignal.com/sdks"
  val uri41 = "https://script.crazyegg.com/pages"

  val scn = scenario("RecordedSimulation")
    .exec(http("request_0")
      .get(uri10 + "/")
      .headers(headers_0)
      .resources(http("request_1")
        .get(uri09 + "/css/alice-home-d5088827a7.css")
        .headers(headers_1),
        http("request_2")
          .get(uri09 + "/js/core-dfb5bbecaa.js")
          .headers(headers_2),
        http("request_3")
          .get(uri09 + "/assets/images/logos/linio-by-fb-92fa2edd4c.svg")
          .headers(headers_3),
        http("request_4")
          .get(uri09 + "/assets/fonts/iconfont-linio-2f22b19d6b.woff2")
          .headers(headers_4),
        http("request_5")
          .get(uri31)
          .headers(headers_2),
        http("request_6")
          .get(uri09 + "/css/alice-53b710c6df.lazy.css")
          .headers(headers_1),
        http("request_7")
          .get(uri37 + "/cms/6ad645b0-05ee-11ec-9004-860be6527422.webp")
          .headers(headers_3),
        http("request_8")
          .get(uri37 + "/cms/7c0dfdee-0415-11ec-8c5e-860be6527422.webp")
          .headers(headers_3),
        http("request_9")
          .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
          .headers(headers_3),
        http("request_10")
          .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
          .headers(headers_10),
        http("request_11")
          .get(uri10 + "/api/order/stats")
          .headers(headers_11),
        http("request_12")
          .get(uri10 + "/ng/mobile-menu")
          .headers(headers_11),
        http("request_13")
          .get(uri35 + "/api_static.js")
          .headers(headers_2),
        http("request_14")
          .get(uri35 + "/api_dynamic.js")
          .headers(headers_2),
        http("request_15")
          .get(uri27 + "?id=GTM-PTM8PD")
          .headers(headers_2),
        http("request_16")
          .get(uri36)
          .headers(headers_16)
          .check(status.is(210)),
        http("request_17")
          .get(uri10 + "/ng/main-menu")
          .headers(headers_11),
        http("request_18")
          .get(uri09 + "/assets/sprites/alice-2330db5b1f-87b340fa20.png")
          .headers(headers_3),
        http("request_19")
          .get(uri37 + "/cms/46df07f2-cf69-11eb-8dfe-ea9ed3d03cf3.webp")
          .headers(headers_3),
        http("request_20")
          .get(uri37 + "/p/0d4245e5b447535da377b12de3413daf-product.webp")
          .headers(headers_3),
        http("request_21")
          .get(uri37 + "/p/ea79f3aca1d598fdad4c52b3285640dd-product.webp")
          .headers(headers_3),
        http("request_22")
          .get("/analytics.js")
          .headers(headers_2),
        http("request_23")
          .get(uri37 + "/cms/d768e81c-a938-11eb-986e-a22e373dfe30.webp")
          .headers(headers_3),
        http("request_24")
          .get(uri37 + "/cms/0febb2e2-ed3b-11ea-b3a7-4afca18a6672.webp")
          .headers(headers_3),
        http("request_25")
          .get(uri37 + "/p/3ca4c54408c2892b4e941bc75ae2c2d7-product.webp")
          .headers(headers_3),
        http("request_26")
          .get("/plugins/ua/ec.js")
          .headers(headers_2),
        http("request_27")
          .get(uri22 + "?sec=8767679&inHead=true&id=0&jsession=j81zq7ycwpsq2q27bqqy3mcfmvvltuqr&ref=&scriptVersion=1.28.3&dyid_server=&ctx=%7B%22type%22%3A%22HOMEPAGE%22%7D")
          .headers(headers_2),
        http("request_28")
          .get(uri41 + "/scripts/0013/6709.js")
          .headers(headers_2),
        http("request_29")
          .get(uri41 + "/data-scripts/0013/6709.json?t=1")
          .headers(headers_29),
        http("request_30")
          .get(uri37 + "/p/0d886d88e616512a59e520f5224b92ee-product.webp")
          .headers(headers_3),
        http("request_31")
          .get(uri41 + "/versioned/common-scripts/11.1.331.js")
          .headers(headers_2),
        http("request_32")
          .get(uri37 + "/p/3c0a8d2bc5d46bbcd180c08b8237a243-product.webp")
          .headers(headers_3),
        http("request_33")
          .get(uri37 + "/p/c0cd3d1d857e2443d3c47d9c0539205a-product.webp")
          .headers(headers_3),
        http("request_34")
          .get(uri37 + "/cms/512b8d6a-55e4-11eb-bf1f-e673225b7336.webp")
          .headers(headers_3),
        http("request_35")
          .get(uri37 + "/p/ede4bf5b3b31286df5807c9c8bb738ee-product.webp")
          .headers(headers_3),
        http("request_36")
          .get(uri37 + "/p/3cf0373144c064fa72ca0c286283b7b4-product.webp")
          .headers(headers_3),
        http("request_37")
          .get(uri41 + "/sampling-data-scripts/0013/6709.json?t=452834")
          .headers(headers_29),
        http("request_38")
          .get("/gtm/js?id=OPT-NNG2275&t=gtm13&cid=710969180.1630205515")
          .headers(headers_2),
        http("request_39")
          .get(uri39 + "/conversion_async.js")
          .headers(headers_2),
        http("request_40")
          .get(uri37 + "/cms/1f215c6e-8489-11ea-9caa-ca3fed3fd0ef.webp")
          .headers(headers_3),
        http("request_41")
          .get(uri33 + "/tm/?t=linio.cl")
          .headers(headers_2),
        http("request_42")
          .get(uri37 + "/p/ae0810033b6fd5cc0455f8cd6fb4577a-product.webp")
          .headers(headers_3),
        http("request_43")
          .get(uri37 + "/p/e3cb4db953b52db97edb81635c827afe-product.webp")
          .headers(headers_3),
        http("request_44")
          .get(uri37 + "/cms/330c3294-8489-11ea-8526-1ea4d6a3f68d.webp")
          .headers(headers_3),
        http("request_45")
          .get(uri37 + "/p/ccdb23ffc679f0b64b13246092a42a78-product.webp")
          .headers(headers_3),
        http("request_46")
          .get(uri37 + "/p/a5ee5793d375876dacc61acc8de56cda-product.webp")
          .headers(headers_3),
        http("request_47")
          .get(uri34)
          .headers(headers_2),
        http("request_48")
          .get("/collect?v=1&_v=j93&a=1411216703&t=pageview&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&xid=0&xvar=0&exp=edOKrHSKRpG_QJZ8lfKlYA.1&_u=aGDAgEILQ~&jid=1059795030&gjid=1817796235&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515084.c339qzii&z=757729525")
          .headers(headers_3),
        http("request_49")
          .get(uri37 + "/p/3f6b447c68d30e0e1b7e8caa7bd49cf4-product.webp")
          .headers(headers_3),
        http("request_50")
          .get(uri37 + "/cms/354b9752-8489-11ea-b3d5-ca3fed3fd0ef.webp")
          .headers(headers_3),
        http("request_51")
          .get(uri37 + "/p/913b7e6dc04b920055d5e914bb370a34-product.webp")
          .headers(headers_3),
        http("request_52")
          .get(uri37 + "/p/80313892d99f3c658bec1b1b504b2a92-product.webp")
          .headers(headers_3),
        http("request_53")
          .get(uri37 + "/cms/5d45b5de-4a05-11eb-ab10-e673225b7336.webp")
          .headers(headers_3),
        http("request_54")
          .get(uri37 + "/cms/4e64e2d6-4a02-11eb-a900-e2a98cf53925.webp")
          .headers(headers_3),
        http("request_55")
          .get(uri11)
          .headers(headers_2),
        http("request_56")
          .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq_home&id=pr_Ep0NkTU4joacylgRKAPq_lid_YhgZj32HC2Xx9mLYS4ft&su=https%3A%2F%2Fwww.linio.cl%2F&sr=&ts=1630205514612")
          .headers(headers_56),
        http("request_57")
          .get(uri37 + "/cms/8cfb4db2-f486-11eb-acbe-168c0a9d1b5d.webp")
          .headers(headers_3),
        http("request_58")
          .get(uri37 + "/p/4eeb206c8617402eedbec21782482333-product.webp")
          .headers(headers_3),
        http("request_59")
          .get(uri37 + "/p/f19f6a7d0d402fdbcb5bf4f9a99b312b-product.webp")
          .headers(headers_3),
        http("request_60")
          .get(uri37 + "/p/066d0a5f5c2deafe83e85fca502ed2ba-product.webp")
          .headers(headers_3),
        http("request_61")
          .get(uri37 + "/cms/eb2201e2-503a-11eb-9571-e673225b7336.webp")
          .headers(headers_3),
        http("request_62")
          .get(uri37 + "/p/9cc4b07a7816f8444c13498b19987e82-product.webp")
          .headers(headers_3),
        http("request_63")
          .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq_home&id=pr_Ep0NkTU4joacylgRKAPq_lid_YhgZj32HC2Xx9mLYS4ft&su=https%3A%2F%2Fwww.linio.cl%2F&sr=&ts=1630205514612&tc=1")
          .headers(headers_56),
        http("request_64")
          .get(uri37 + "/cms/79bdf42c-55a6-11eb-9816-e673225b7336.webp")
          .headers(headers_3),
        http("request_65")
          .get(uri37 + "/p/54b19e86d2d727d8913360770080dcd8-product.webp")
          .headers(headers_3),
        http("request_66")
          .get(uri37 + "/p/c21213bc4422166be5a70650926eb552-product.webp")
          .headers(headers_3),
        http("request_67")
          .get(uri37 + "/p/e8d80934daf5b38058d1a01c17b8fdb8-product.webp")
          .headers(headers_3),
        http("request_68")
          .get(uri37 + "/cms/1c13e99e-55a6-11eb-ba7d-e2a98cf53925.webp")
          .headers(headers_3),
        http("request_69")
          .get(uri37 + "/p/8d2b569a322fa84f1a7c7237be36c4a3-product.webp")
          .headers(headers_3),
        http("request_70")
          .get(uri24)
          .headers(headers_2),
        http("request_71")
          .get(uri37 + "/p/e0cd7a5e04ad8cb71d88e6f7dd6520c6-product.webp")
          .headers(headers_3),
        http("request_72")
          .get(uri40 + "/OneSignalSDK.js")
          .headers(headers_2),
        http("request_73")
          .get(uri37 + "/p/520984bf7b3ac274d4f8c0fe554a0917-product.webp")
          .headers(headers_3),
        http("request_74")
          .get(uri37 + "/cms/886ca0ce-ee1a-11eb-aeef-1a0d3920135d.webp")
          .headers(headers_3),
        http("request_75")
          .get(uri37 + "/p/c9b3551c86eb81b3e7e006f8efcd0064-product.webp")
          .headers(headers_3),
        http("request_76")
          .get(uri32 + "/extra-resources?ti=Ep0NkTU4joacylgRKAPq")
          .headers(headers_76),
        http("request_77")
          .get(uri37 + "/p/72251501b6b1e1189beb000f4feecc68-product.webp")
          .headers(headers_3),
        http("request_78")
          .get(uri37 + "/p/b6bf055df5c49ff9b06d5909e69eae5b-product.webp")
          .headers(headers_3),
        http("request_79")
          .get(uri17 + "?tag=linio-cl-general")
          .headers(headers_2),
        http("request_80")
          .get(uri07 + "/scripts/1.28.3/dy-coll-nojq-min.js")
          .headers(headers_2),
        http("request_81")
          .get(uri07 + "/variations/8767679/196251/14817904/ba5db75b2bbc560553a0e94772d2e5ae.json")
          .headers(headers_29),
        http("request_82")
          .get(uri37 + "/cms/4f7f62c2-ee1c-11eb-a0a1-c6d6a10dff4c.webp")
          .headers(headers_3),
        http("request_83")
          .get(uri37 + "/p/087b1718f1a77ea7350df879500657ce-product.webp")
          .headers(headers_3),
        http("request_84")
          .get(uri37 + "/p/d056d2c89cfad99616886dfda391aa2a-product.webp")
          .headers(headers_3),
        http("request_85")
          .get(uri39 + "/conversion/963429843/?random=1630205515705&cv=9&fst=1630205515705&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
          .headers(headers_2),
        http("request_86")
          .get(uri37 + "/p/7ebbc85c5f7fa0a67e2b09ebfe0629f2-product.webp")
          .headers(headers_3),
        http("request_87")
          .get(uri20)
          .headers(headers_2),
        http("request_88")
          .get(uri37 + "/cms/35af18de-5aaf-11eb-9c4c-e2a98cf53925.webp")
          .headers(headers_3),
        http("request_89")
          .get(uri37 + "/p/584ace4036c43afd233cfd9a1247004b-product.webp")
          .headers(headers_3),
        http("request_90")
          .post("/j/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%202&el=Copy%20of%20H%7CB%7CV-2%7CG%7CNA%7CW35-Celulares%20(H%7CB%7CV-2%7CG%7CNA%7CW35-Celulares)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=1773157687&gjid=583112723&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&_r=1&gtm=2wg8p0PTM8PD&cd3=1630205515796.s3hlwvx&z=555575545")
          .headers(headers_90),
        http("request_93")
          .get(uri04 + "?&t=1")
          .headers(headers_2),
        http("request_94")
          .get(uri37 + "/p/8806a42de53c94eb119d896bef294c5e-product.webp")
          .headers(headers_3),
        http("request_95")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%203&el=Nuevos%20usuarios%20-%20Todo%20a%20menos%20(Todo%20a%20menos)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515821.n6cyzbm&z=919019139")
          .headers(headers_3),
        http("request_96")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%204&el=Nuevos%20usuarios%20-%20Los%20m%C3%A1s%20vendidos%20(Los%20m%C3%A1s%20vendidos)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515835.cugcz59n&z=1078829860")
          .headers(headers_3),
        http("request_98")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%205&el=Copy%20of%20H%7CB%7CV-5%7CG%7CNA%7CW34-Dormitorio%20(H%7CB%7CV-5%7CG%7CNA%7CW34-Dormitorio)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515848.2vkcmvg&z=1065667971")
          .headers(headers_3),
        http("request_99")
          .get(uri37 + "/p/a6560fae81766b1dce4228e6496070e1-product.webp")
          .headers(headers_3),
        http("request_100")
          .get(uri37 + "/cms/0dd9be30-d5da-11eb-834f-96a0bacba68a.webp")
          .headers(headers_3),
        http("request_101")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Test%20-%20Mini%20Teasers%20Optimizacion&el=Optimizacion%20-%20Usuarios%20nuevos%20(Control%20Group%3A%20No%20Action)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515866.81dyursp&z=2028794950")
          .headers(headers_3),
        http("request_102")
          .get(uri37 + "/p/2f7e422bb7ffc4c9429b625683882aa3-product.webp")
          .headers(headers_3),
        http("request_103")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3EHeader%20Solo%20Hoy&el=Contador%206%20(Header%20con%20Contador)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515888.5x91lva&z=232643602")
          .headers(headers_3),
        http("request_104")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%201&el=H%7CB%7CC3-1%7CG%7CNA%7CW35-Fitness%20(H%7CB%7CC3-1%7CG%7CNA%7CW35-Fitness)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515919.jyus9ppr&z=910805241")
          .headers(headers_3),
        http("request_105")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%202&el=H%7CB%7CC3-2%7CG%7CNA%7CW35-Ropa%20(H%7CB%7CC3-2%7CG%7CNA%7CW35-Ropa%20deportiva)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515931.l5cwy11j&z=16689735")
          .headers(headers_3),
        http("request_106")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%203&el=H%7CB%7CC3-3%7CG%7CNA%7CW35-Ciclismo%20(H%7CB%7CC3-3%7CG%7CNA%7CW35-Ciclismo)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515946.dbtrlgxd&z=1426193115")
          .headers(headers_3),
        http("request_107")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3EPromocional%202&el=H%7CB%7CL%7CG%7CNA%7CW34-acumulapuntosCMR%20(H%7CB%7CL%7CG%7CNA%7CW34-acumulapuntosCMR)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205515959.9v606fp&z=228343265")
          .headers(headers_3),
        http("request_109")
          .get(uri37 + "/cms/7a518a78-8489-11ea-979c-ca3fed3fd0ef.webp")
          .headers(headers_3),
        http("request_110")
          .get(uri37 + "/p/fa610780faf78f7a08baf6de147d0f16-product.webp")
          .headers(headers_3),
        http("request_111")
          .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Action&ea=Linio%20%7C%20Onsite%20%7C%20Desktop%20%7C%20Notification%20Pop-up&el=Popup%20cupon%2010%25%20dscto%20imp%20(vta%20nocturna%20%20imp%20cmr)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205516028.0uupfok&z=2090850674")
          .headers(headers_3),
        http("request_112")
          .get(uri37 + "/p/efdd258d79d8ba0f27161d9417a64e55-product.webp")
          .headers(headers_3),
        http("request_113")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/25a0ef8e41206__190x91_celulares_1.jpg")
          .headers(headers_3),
        http("request_115")
          .get(uri18 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd%26ci%3Dundefined&p1=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=3207")
          .headers(headers_2),
        http("request_116")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2fa941943b5b0__5adbbc1e-043e-11ec-989a-860be6527422.jpg")
          .headers(headers_3),
        http("request_117")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2a1d8222692d7__190x91_coleccionables_1.jpg")
          .headers(headers_3),
        http("request_118")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/33bfece0e4580__190x91_computing.jpg")
          .headers(headers_3),
        http("request_119")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1c160d58ccdef__190x91_hogar_1.jpg")
          .headers(headers_3),
        http("request_120")
          .get(uri40 + "/OneSignalPageSDKES6.js?v=151507")
          .headers(headers_2),
        http("request_121")
          .get(uri37 + "/cms/12912064-60cb-11eb-a49e-e673225b7336.webp")
          .headers(headers_3),
        http("request_122")
          .get(uri37 + "/p/4160f258cdd6965d5043a451aa28a95d-product.webp")
          .headers(headers_3),
        http("request_123")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2e79c5a38cbf3__190x91_gadgets_1.jpg")
          .headers(headers_3),
        http("request_124")
          .get(uri37 + "/p/fac00b2d2ce1b80b3a8c8f9407520e4f-product.webp")
          .headers(headers_3),
        http("request_125")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1a8c554a0f7d__190x91_electrodomesticos_1.jpg")
          .headers(headers_3),
        http("request_127")
          .post(uri10 + "/api/catalog/personalized-feed/Row%203%20-%20Recomendaciones/homepage")
          .headers(headers_127),
        http("request_128")
          .get(uri29 + "/1p-user-list/1004172317/?random=1630205515026&cv=9&fst=1630202400000&num=1&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&async=1&fmt=3&is_vtc=1&random=2000451222&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
          .headers(headers_3),
        http("request_129")
          .get(uri26 + "?google_nid=mainad_comunicacoes_ltda&google_ula=1060335013&google_cm&cok15=$CookieName$&cnty15=$GRegionCode$&ProgramName=Linio_CL&AudienceId=826&CampaignId=0&Referrer=https%3A%2F%2Fwww.linio.cl%2F&pagetype=home&Browsercheck=true")
          .headers(headers_56),
        http("request_130")
          .post(uri10 + "/api/catalog/personalized-feed/Row%204%20-%20Recomendaciones/homepage")
          .headers(headers_127),
        http("request_131")
          .post(uri10 + "/api/catalog/personalized-feed/Row%202%20-%20Recomendaciones/homepage")
          .headers(headers_127),
        http("request_136")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/361d9c967cae2__onbb_welcome_nuevosusuarios_cl.jpg")
          .headers(headers_3),
        http("request_137")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1f5c32beffc62__onbb_compras_nuevosusuarios_co.jpg")
          .headers(headers_3),
        http("request_138")
          .get(uri26 + "?google_nid=mainad_comunicacoes_ltda&google_ula=1060335013&google_cm=&cok15=$CookieName$&cnty15=$GRegionCode$&ProgramName=Linio_CL&AudienceId=826&CampaignId=0&Referrer=https%3A%2F%2Fwww.linio.cl%2F&pagetype=home&Browsercheck=true&google_tc=")
          .headers(headers_56),
        http("request_139")
          .post(uri13 + "/t")
          .headers(headers_90)
          .body(RawFileBody("recordedsimulation/0139_request.txt")),
        http("request_140")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/27a48df42b5b0__on_ts1.jpg")
          .headers(headers_3),
        http("request_141")
          .post(uri13 + "/p")
          .headers(headers_90)
          .body(RawFileBody("recordedsimulation/0141_request.txt")),
        http("request_142")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1a244e1eedca6__on_ts2.jpg")
          .headers(headers_3),
        http("request_143")
          .get(uri29 + "/1p-conversion/963429843/?random=144582559&cv=9&fst=1630205515705&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=S_YqYc21KpqV1Aa6s5SYCA&random=2936334627&resp=GooglemKTybQhCsO")
          .headers(headers_3),
        http("request_144")
          .get(uri15 + "?id=mainad_comunicacoes_ltda&cok15=$CookieName$&cnty15=$GRegionCode$&ProgramName=Linio_CL&AudienceId=826&CampaignId=0&Referrer=https%3A%2F%2Fwww.linio.cl%2F&pagetype=home&Browsercheck=true&google_error=3")
          .headers(headers_56),
        http("request_145")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/340b1cefc54c3__hd_on_cl_promotionalcmr.jpg")
          .headers(headers_3),
        http("request_146")
          .get(uri29 + "/1p-user-list/969755919/?random=1630205515037&cv=9&fst=1630202400000&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&async=1&fmt=3&is_vtc=1&random=2712088760&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
          .headers(headers_3),
        http("request_147")
          .get(uri30 + "/1p-user-list/1004172317/?random=1630205515026&cv=9&fst=1630202400000&num=1&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&async=1&fmt=3&is_vtc=1&random=2000451222&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
          .headers(headers_3),
        http("request_148")
          .get(uri30 + "/1p-user-list/969755919/?random=1630205515037&cv=9&fst=1630202400000&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&async=1&fmt=3&is_vtc=1&random=2712088760&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
          .headers(headers_3),
        http("request_150")
          .get(uri30 + "/1p-conversion/963429843/?random=144582559&cv=9&fst=1630205515705&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=S_YqYc21KpqV1Aa6s5SYCA&random=2936334627&resp=GooglemKTybQhCsO&ipr=y")
          .headers(headers_3),
        http("request_151")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1cdc552d5c8be__popup_imp.png")
          .headers(headers_3),
        http("request_152")
          .get(uri37 + "/p/a7ede4cd8cdcc99566db21bad29e445d-card.webp")
          .headers(headers_3),
        http("request_153")
          .get(uri37 + "/p/4441687924dd4607d13be48290e11e3e-card.webp")
          .headers(headers_3),
        http("request_154")
          .get(uri37 + "/p/90107469be839435aa1f75e5f347c661-card.webp")
          .headers(headers_3),
        http("request_155")
          .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dvh&p1=e%3Dexd%26ci%3Dundefined%26site_type%3Dd&p2=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=68253")
          .headers(headers_2),
        http("request_156")
          .get(uri21 + "?a=14897&v=5.7.1&p0=e%3Dexd%26ci%3Dundefined%26site_type%3Dd&p1=e%3Dvh&p2=e%3Ddis&adce=1&tld=linio.cl&dtycbr=77737")
          .headers(headers_2),
        http("request_157")
          .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd%26ci%3Dundefined&p1=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=3207")
          .headers(headers_2),
        http("request_158")
          .get(uri03 + "/0d16929e-c9bf-11e9-a45a-52dc582f5ff5.png")
          .headers(headers_158),
        http("request_159")
          .get(uri03 + "/42fa44bc-c9bc-11e9-a351-52dc582f5ff5.png")
          .headers(headers_158),
        http("request_160")
          .get(uri03 + "/482519c2-eb06-11eb-81fc-c6d6a10dff4c.png")
          .headers(headers_158),
        http("request_161")
          .get(uri37 + "/p/535579cc9f6bcb1500699fe7b9f184ac-card.webp")
          .headers(headers_3),
        http("request_162")
          .get(uri06 + "/api/v1/sync/a7f32eea-2f96-4ca2-a1fd-2184199629d3/web?callback=__jp0")
          .headers(headers_2),
        http("request_163")
          .get(uri37 + "/p/8e69ee33514b3be763db02ad7f4676f8-card.webp")
          .headers(headers_3),
        http("request_164")
          .get(uri37 + "/p/31a3e9eaea3c9838bad4f9fb409ba15a-card.webp")
          .headers(headers_3),
        http("request_165")
          .get(uri37 + "/p/94bda0a8b4c6d88a5b9203e3934db21b-card.webp")
          .headers(headers_3),
        http("request_166")
          .get(uri37 + "/p/836e32f461a4c7bd237ae4fcfafebe3c-card.webp")
          .headers(headers_3),
        http("request_167")
          .get(uri37 + "/p/f86188a11f4d842b77b37b5fccf1e80d-card.webp")
          .headers(headers_3),
        http("request_168")
          .get(uri37 + "/p/28f1822cf3155a020cf198a744c33018-card.webp")
          .headers(headers_3),
        http("request_169")
          .get(uri37 + "/p/4146bce4fee63b5499a5b2018c38ca36-card.webp")
          .headers(headers_3),
        http("request_170")
          .get(uri37 + "/p/abf8f725e7a19cb064badd9d8fcaf7ba-card.webp")
          .headers(headers_3),
        http("request_171")
          .get(uri37 + "/p/0b88b3b0f0b1a39284515f36dfca8a1c-card.webp")
          .headers(headers_3),
        http("request_172")
          .get(uri37 + "/p/3d45a25ad4c88c81d9a2d670b50e6ed5-card.webp")
          .headers(headers_3),
        http("request_173")
          .get(uri37 + "/p/80bbaaaf5934f3c614ab27f1a6d85ebb-card.webp")
          .headers(headers_3),
        http("request_183")
          .get(uri37 + "/p/81d437a2635ed3cac737113e1b6fea07-card.webp")
          .headers(headers_3),
        http("request_184")
          .get(uri37 + "/p/10059aaf4fa3d6a98f4a88e79d29c447-card.webp")
          .headers(headers_3),
        http("request_185")
          .get(uri37 + "/p/27f738d915547509ffd5e329dfad4081-card.webp")
          .headers(headers_3),
        http("request_186")
          .get(uri37 + "/p/538eb50c75b20361e577fa89db982253-card.webp")
          .headers(headers_3),
        http("request_187")
          .get(uri37 + "/p/81a80a875773108720445306a65a83ec-card.webp")
          .headers(headers_3),
        http("request_188")
          .get(uri37 + "/p/bcaecda6ac0b6b3615d26e443471f878-card.webp")
          .headers(headers_3),
        http("request_189")
          .get(uri37 + "/p/1803ef5bf015a9bd4dc827816005034f-card.webp")
          .headers(headers_3),
        http("request_190")
          .get(uri37 + "/p/6b82d3178c4d688692debafc7691ad96-card.webp")
          .headers(headers_3),
        http("request_191")
          .get(uri37 + "/p/e10e8c290c1962b55d2aa97d4b0219a8-card.webp")
          .headers(headers_3),
        http("request_192")
          .get(uri37 + "/p/eaa2d53678990b0387c2b7d2e5661bf9-card.webp")
          .headers(headers_3),
        http("request_193")
          .get(uri37 + "/p/4a6d68ff440dd3a8a8f02c890f36787d-card.webp")
          .headers(headers_3),
        http("request_194")
          .get(uri37 + "/p/6865b748205b107b445edbcc0e4c01de-card.webp")
          .headers(headers_3),
        http("request_195")
          .get(uri37 + "/p/1291350fe5f648d02af986e2af8b0004-card.webp")
          .headers(headers_3),
        http("request_196")
          .get(uri37 + "/p/2d0cc54d4526e749a0a541585f6b4ccf-card.webp")
          .headers(headers_3),
        http("request_197")
          .get(uri37 + "/p/c13c6634e1238d3f9df3fb51eea227c2-card.webp")
          .headers(headers_3),
        http("request_198")
          .get(uri37 + "/p/691c676c0528bf25388bb3d41bc62bf7-card.webp")
          .headers(headers_3),
        http("request_199")
          .get(uri37 + "/p/9e93ccc63db1f294329a47accfdd0198-card.webp")
          .headers(headers_3),
        http("request_200")
          .get(uri37 + "/p/801ef6699c0e719f950a2b468d72f4e7-card.webp")
          .headers(headers_3),
        http("request_201")
          .get(uri37 + "/p/c1e0f64491e21bde5fc6e137a6d7ff08-card.webp")
          .headers(headers_3),
        http("request_202")
          .get(uri37 + "/p/2959f5d02cea365bb1b5591609c6e1ab-card.webp")
          .headers(headers_3),
        http("request_203")
          .get(uri37 + "/p/c12cdb2313b34636589d065a7e78042e-card.webp")
          .headers(headers_3),
        http("request_204")
          .get(uri37 + "/p/fe801789333e85b21fc62b5d2e1ef2be-card.webp")
          .headers(headers_3),
        http("request_205")
          .get(uri37 + "/p/0c78b816e4f3e3c924f7c5cec20a3dc2-card.webp")
          .headers(headers_3),
        http("request_206")
          .get(uri37 + "/p/b1d3633141757b8fc70e68e1c54bbb2e-card.webp")
          .headers(headers_3),
        http("request_207")
          .get(uri37 + "/p/f036cd87091e05b82fd5eb4205834553-card.webp")
          .headers(headers_3),
        http("request_208")
          .get(uri37 + "/p/a02f712eb7e743d40348ce4b7aeae1a4-card.webp")
          .headers(headers_3),
        http("request_209")
          .get(uri37 + "/p/ac721fb93b2df60fccede16227d34b2b-card.webp")
          .headers(headers_3),
        http("request_210")
          .get(uri37 + "/p/694a44678e29a6adee8b51c727a6b182-card.webp")
          .headers(headers_3),
        http("request_211")
          .get(uri37 + "/p/1eededaef55cfc5f9d012ad17a6c7d48-card.webp")
          .headers(headers_3),
        http("request_212")
          .get(uri37 + "/p/ea2bc83ed4d77da5a3d3de7194df8f1a-card.webp")
          .headers(headers_3),
        http("request_213")
          .get(uri37 + "/p/c0cd3d1d857e2443d3c47d9c0539205a-card.webp")
          .headers(headers_3),
        http("request_214")
          .get(uri37 + "/p/93b92db0d29c3ac19bf89d1ac6e4b210-card.webp")
          .headers(headers_3),
        http("request_215")
          .get(uri37 + "/p/d66135eb4fb82bb5eb2be25a2da2e652-card.webp")
          .headers(headers_3),
        http("request_216")
          .get(uri37 + "/p/b344c955dc17b3431f5456d49672afb5-card.webp")
          .headers(headers_3),
        http("request_217")
          .get(uri37 + "/p/5ac714a9e7c3af72cbca7f60a5311f71-card.webp")
          .headers(headers_3),
        http("request_218")
          .get(uri37 + "/p/e66d8a72e85adb4c6e0a21ec5b0af7a7-card.webp")
          .headers(headers_3),
        http("request_219")
          .get(uri37 + "/p/7eb26342201c31485901765290ef39e4-card.webp")
          .headers(headers_3),
        http("request_220")
          .get(uri37 + "/p/11462d956325fb0eb15646eaa88bd413-card.webp")
          .headers(headers_3),
        http("request_221")
          .get(uri37 + "/p/be12100ca85bf3966213cfacc0d9c67e-card.webp")
          .headers(headers_3),
        http("request_222")
          .get(uri37 + "/p/e9d97ae1a1319cc82ab5f99b62a43302-card.webp")
          .headers(headers_3),
        http("request_223")
          .get(uri37 + "/p/2cf855f45d5d7f0a3096d2f914f8e312-card.webp")
          .headers(headers_3),
        http("request_224")
          .get(uri37 + "/p/df5b6322c6e8a0c3bcbd416ad3dfc1d3-card.webp")
          .headers(headers_3),
        http("request_225")
          .get(uri37 + "/p/e9c62f25ddb3ec50b317f32ea86336e1-card.webp")
          .headers(headers_3),
        http("request_226")
          .get(uri37 + "/p/75f5e5afa00b3f4870cb7951bc064aa4-card.webp")
          .headers(headers_3),
        http("request_227")
          .get(uri37 + "/p/3c4db813c863b261103680fcc1c3960a-card.webp")
          .headers(headers_3),
        http("request_228")
          .get(uri37 + "/p/f8ba953c1e1e83138bc3b0147c3e378d-card.webp")
          .headers(headers_3),
        http("request_229")
          .get(uri37 + "/p/48905ff40fe99d4889ccf6d0262eee7c-card.webp")
          .headers(headers_3),
        http("request_230")
          .get(uri37 + "/p/df0a43979ac84974cd576983f1583e9f-card.webp")
          .headers(headers_3),
        http("request_231")
          .get(uri37 + "/p/66aacf17944fb5b1901603eefe2f7625-card.webp")
          .headers(headers_3),
        http("request_232")
          .get(uri37 + "/p/93a3053e651e9530eebf40a7cd731fd8-card.webp")
          .headers(headers_3),
        http("request_233")
          .get(uri37 + "/p/f3d7db34536ee8b8d02f561e0bf99e47-card.webp")
          .headers(headers_3),
        http("request_234")
          .get(uri37 + "/p/475ca316084c800e33be57d0889949ef-card.webp")
          .headers(headers_3),
        http("request_235")
          .get(uri37 + "/p/283ffaf99d4ca200b263dee5da0fb575-card.webp")
          .headers(headers_3),
        http("request_236")
          .get(uri37 + "/p/d4c88b43c1a9f1ae8cc04cfea8c04ed9-card.webp")
          .headers(headers_3),
        http("request_237")
          .get(uri37 + "/p/3e4a77a0f95e73bf9a072fbff537e0cc-card.webp")
          .headers(headers_3),
        http("request_238")
          .get(uri37 + "/p/2c79f4246f51476daef1bfead75ca877-card.webp")
          .headers(headers_3),
        http("request_239")
          .get(uri37 + "/p/bc3a5cace7310606f0a770dd6144cb7b-card.webp")
          .headers(headers_3),
        http("request_240")
          .get(uri37 + "/p/d0eab973742a6324ebc99df8a7b1067a-card.webp")
          .headers(headers_3),
        http("request_241")
          .get(uri37 + "/p/ae0810033b6fd5cc0455f8cd6fb4577a-card.webp")
          .headers(headers_3),
        http("request_242")
          .get(uri37 + "/p/865d1dea777086c4c23ee785eb6fda8e-card.webp")
          .headers(headers_3),
        http("request_243")
          .get(uri37 + "/p/48e4842cb6a2b4af8dd69756193e5e16-card.webp")
          .headers(headers_3),
        http("request_244")
          .get(uri37 + "/p/d4ff86507709f3cbda48f5db0f09bb27-card.webp")
          .headers(headers_3),
        http("request_245")
          .get(uri37 + "/p/ac6b7cea073ccbab89f58688f5f9743a-card.webp")
          .headers(headers_3),
        http("request_246")
          .get(uri37 + "/p/ea79f3aca1d598fdad4c52b3285640dd-card.webp")
          .headers(headers_3)))
    .pause(1)
    .exec(http("request_247")
      .get("/collect?v=1&_v=j93&a=1411216703&t=event&ni=0&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=ui%20%3A%3A%20main_header%20%3A%3A%20user_menu&ea=click&el=my%20account%20%3A%3A%20Iniciar%20sesi%C3%B3n%20%3A%3A%20https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ev=1&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205520718.b3nfq894&z=1968711248")
      .headers(headers_3)
      .resources(http("request_248")
        .post("/collect")
        .headers(headers_248)
        .body(RawFileBody("recordedsimulation/0248_request.txt")),
        http("request_249")
          .get(uri10 + "/account/login")
          .headers(headers_249),
        http("request_250")
          .get(uri09 + "/js/core-dfb5bbecaa.js")
          .headers(headers_10),
        http("request_252")
          .get(uri28 + "?")
          .headers(headers_16),
        http("request_253")
          .get(uri09 + "/css/alice-8953651e57.css")
          .headers(headers_1),
        http("request_254")
          .get(uri09 + "/js/auth-15668ccf28.js")
          .headers(headers_2),
        http("request_255")
          .get(uri09 + "/js/shopping-023e31f84f.js")
          .headers(headers_2),
        http("request_256")
          .get(uri09 + "/assets/fonts/iconfont-linio-2f22b19d6b.woff2")
          .headers(headers_256),
        http("request_257")
          .get(uri09 + "/assets/images/logos/linio-by-fb-gray-b90f0f5ecc.svg")
          .headers(headers_3),
        http("request_258")
          .get(uri38 + "/js/api:client.js?onload=googleAsyncInit")
          .headers(headers_2),
        http("request_260")
          .get(uri38 + "/_/scs/apps-static/_/js/k=oz.gapi.en_US.UYHeVG_mX5s.O/m=client/rt=j/sv=1/d=1/ed=1/am=AQ/rs=AGLTcCPDcESMLF74mIvk5CKxuCjzYIf5XA/cb=gapi.loaded_0")
          .headers(headers_2),
        http("request_261")
          .get(uri31)
          .headers(headers_10),
        http("request_262")
          .get(uri09 + "/css/alice-53b710c6df.lazy.css")
          .headers(headers_10),
        http("request_263")
          .get(uri27 + "?id=GTM-PTM8PD")
          .headers(headers_10),
        http("request_264")
          .get(uri36)
          .headers(headers_10)
          .check(status.is(210)),
        http("request_265")
          .get(uri35 + "/api_static.js")
          .headers(headers_10),
        http("request_266")
          .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
          .headers(headers_10),
        http("request_267")
          .get(uri09 + "/assets/sprites/alice-2330db5b1f-87b340fa20.png")
          .headers(headers_10),
        http("request_268")
          .get(uri35 + "/api_dynamic.js")
          .headers(headers_10),
        http("request_269")
          .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
          .headers(headers_10),
        http("request_270")
          .get("/analytics.js")
          .headers(headers_10),
        http("request_271")
          .get(uri39 + "/conversion_async.js")
          .headers(headers_10),
        http("request_272")
          .get(uri24)
          .headers(headers_10),
        http("request_273")
          .get(uri33 + "/tm/?t=linio.cl")
          .headers(headers_10),
        http("request_274")
          .get(uri17 + "?tag=linio-cl-general")
          .headers(headers_10),
        http("request_275")
          .get(uri20)
          .headers(headers_10),
        http("request_277")
          .get(uri40 + "/OneSignalSDK.js")
          .headers(headers_10),
        http("request_278")
          .get(uri41 + "/scripts/0013/6709.js")
          .headers(headers_2),
        http("request_279")
          .get("/plugins/ua/ec.js")
          .headers(headers_10),
        http("request_280")
          .get(uri40 + "/OneSignalPageSDKES6.js?v=151507")
          .headers(headers_10),
        http("request_281")
          .get(uri08)
          .headers(headers_2),
        http("request_282")
          .get(uri41 + "/data-scripts/0013/6709.json?t=1")
          .headers(headers_29),
        http("request_285")
          .get(uri22 + "?sec=8767679&inHead=true&id=6674335104659813962&jsession=j81zq7ycwpsq2q27bqqy3mcfmvvltuqr&ref=https%3A%2F%2Fwww.linio.cl%2F&scriptVersion=1.28.3&dyid_server=")
          .headers(headers_2),
        http("request_286")
          .get(uri41 + "/versioned/common-scripts/11.1.331.js")
          .headers(headers_10),
        http("request_288")
          .get(uri11)
          .headers(headers_10),
        http("request_289")
          .get("/gtm/js?id=OPT-NNG2275&t=gtm13&cid=710969180.1630205515&gac=_gaexp%3DGAX1.2.edOKrHSKRpG_QJZ8lfKlYA.18950.1")
          .headers(headers_2),
        http("request_291")
          .get(uri06 + "/api/v1/sync/a7f32eea-2f96-4ca2-a1fd-2184199629d3/web?callback=__jp0")
          .headers(headers_10),
        http("request_292")
          .get(uri07 + "/scripts/1.28.3/dy-coll-nojq-min.js")
          .headers(headers_10),
        http("request_293")
          .get(uri29 + "/1p-user-list/1004172317/?random=1630205522378&cv=9&fst=1630202400000&num=1&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&async=1&fmt=3&is_vtc=1&random=3598521706&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
          .headers(headers_3),
        http("request_294")
          .get(uri29 + "/1p-user-list/969755919/?random=1630205522393&cv=9&fst=1630202400000&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&async=1&fmt=3&is_vtc=1&random=2621658172&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
          .headers(headers_3),
        http("request_295")
          .get(uri39 + "/conversion/963429843/?random=1630205522616&cv=9&fst=1630205522616&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
          .headers(headers_2),
        http("request_297")
          .get(uri30 + "/1p-user-list/969755919/?random=1630205522393&cv=9&fst=1630202400000&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&async=1&fmt=3&is_vtc=1&random=2621658172&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
          .headers(headers_3),
        http("request_298")
          .get(uri30 + "/1p-user-list/1004172317/?random=1630205522378&cv=9&fst=1630202400000&num=1&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&async=1&fmt=3&is_vtc=1&random=3598521706&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
          .headers(headers_3),
        http("request_299")
          .get(uri33 + "/lse1.0.html")
          .headers(headers_56),
        http("request_300")
          .get("/collect?v=1&_v=j93&a=2143816658&t=pageview&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ul=en-in&de=UTF-8&dt=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&sd=24-bit&sr=1366x700&vp=1350x700&je=0&exp=edOKrHSKRpG_QJZ8lfKlYA.1&_u=SCCAgEILQ~&jid=&gjid=&cid=710969180.1630205515&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205522739.nbz4uop3&z=1023673772")
          .headers(headers_3),
        http("request_301")
          .get(uri41 + "/sampling-data-scripts/0013/6709.json?t=452834")
          .headers(headers_29),
        http("request_302")
          .post(uri13 + "/p")
          .headers(headers_90)
          .body(RawFileBody("recordedsimulation/0302_request.txt")),
        http("request_303")
          .get(uri18 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd&p1=e%3Ddis&adce=1&tld=linio.cl&dtycbr=79270")
          .headers(headers_2),
        http("request_306")
          .get(uri29 + "/1p-conversion/963429843/?random=1738339838&cv=9&fst=1630205522616&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=UvYqYZLrIJKV1AbJs4rwDQ&random=179238856&resp=GooglemKTybQhCsO")
          .headers(headers_3),
        http("request_308")
          .get(uri30 + "/1p-conversion/963429843/?random=1738339838&cv=9&fst=1630205522616&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=UvYqYZLrIJKV1AbJs4rwDQ&random=179238856&resp=GooglemKTybQhCsO&ipr=y")
          .headers(headers_3),
        http("request_309")
          .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd&p1=e%3Ddis&adce=1&tld=linio.cl&dtycbr=79270")
          .headers(headers_2),
        http("request_312")
          .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq&id=pr_Ep0NkTU4joacylgRKAPq_lid_YhgZj32HC2Xx9mLYS4ft&su=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&sr=https%3A%2F%2Fwww.linio.cl%2F&ts=1630205522337&tc=1")
          .headers(headers_56),
        http("request_313")
          .get(uri32 + "/extra-resources?ti=Ep0NkTU4joacylgRKAPq")
          .headers(headers_76)))
    .pause(9)
    .exec(http("request_316")
      .get(uri09 + "/assets/images/svgIcons/input-ok-fe4e993cb4.svg")
      .headers(headers_3))
    .pause(2)
    .exec(http("request_317")
      .get(uri06 + "/sdks/OneSignalSDKStyles.css?v=2")
      .headers(headers_1)
      .resources(http("request_318")
        .get(uri06 + "/api/v1/apps/a7f32eea-2f96-4ca2-a1fd-2184199629d3/icon")
        .headers(headers_29),
        http("request_319")
          .get(uri19)
          .headers(headers_3)))
    .pause(1)
    .exec(http("request_321")
      .get(uri16 + "/tr/?id=543671342917527&ev=SubscribedButtonClick&dl=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&rl=https%3A%2F%2Fwww.linio.cl%2F&if=false&ts=1630205547359&cd[buttonFeatures]=%7B%22classList%22%3A%22btn%20btn-security%20col-xs-12%22%2C%22destination%22%3A%22https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin_check%22%2C%22id%22%3A%22%22%2C%22imageUrl%22%3A%22%22%2C%22innerText%22%3A%22%20Iniciar%20sesi%C3%B3n%20segura%22%2C%22numChildButtons%22%3A0%2C%22tag%22%3A%22button%22%2C%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D&cd[buttonText]=%20Iniciar%20sesi%C3%B3n%20segura&cd[formFeatures]=%5B%7B%22id%22%3A%22login_form_email%22%2C%22name%22%3A%22login_form%5Bemail%5D%22%2C%22tag%22%3A%22input%22%2C%22placeholder%22%3A%22Ejemplo%3A%20jgonzalesc89%40gmail.com%22%2C%22inputType%22%3A%22email%22%7D%2C%7B%22id%22%3A%22login_form_password%22%2C%22name%22%3A%22login_form%5Bpassword%5D%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22password%22%7D%2C%7B%22id%22%3A%22login_form__token%22%2C%22name%22%3A%22login_form%5B_token%5D%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22hidden%22%7D%5D&cd[pageFeatures]=%7B%22title%22%3A%22Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile%22%7D&cd[parameters]=%5B%5D&sw=1366&sh=700&udff[em]=146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2&v=2.9.45&r=stable&a=seg&ec=3&o=2078&fbp=fb.1.1630205516319.679381069&it=1630205522698&coo=false&dpo=LDU&dpoco=0&dpost=0&es=automatic&tm=3&exp=p0&rqm=GET")
      .headers(headers_3)
      .resources(http("Login_Check")
        .post(uri10 + "/account/login_check")
        .headers(headers_322)
        .formParam("login_form[email]", "abhic2534@gmail.com")
        .formParam("login_form[password]", "Qwerty@123")
        .formParam("login_form[_token]", "4264b224a77b1aad848651e871f8bddf.f4QZcvx-dPYNz0xz0Ly2Xy0LUqxxZK4Ppy2RLJ0QrZY.L-1vEJVOQYc4jDk5ivf9L2lJDeQcSdxtyx28Zvxy_c4csEsquzUWp1WmJw"),
        http("request_323")
          .get(uri09 + "/css/alice-home-d5088827a7.css")
          .headers(headers_10),
        http("request_324")
          .get(uri09 + "/js/core-dfb5bbecaa.js")
          .headers(headers_10),
        http("request_325")
          .get(uri09 + "/assets/fonts/iconfont-linio-2f22b19d6b.woff2")
          .headers(headers_256),
        http("request_326")
          .get(uri09 + "/assets/images/logos/linio-by-fb-92fa2edd4c.svg")
          .headers(headers_10),
        http("request_327")
          .get(uri31)
          .headers(headers_10),
        http("request_328")
          .get(uri09 + "/css/alice-53b710c6df.lazy.css")
          .headers(headers_10),
        http("request_329")
          .get(uri37 + "/cms/7c0dfdee-0415-11ec-8c5e-860be6527422.webp")
          .headers(headers_10),
        http("request_330")
          .get(uri37 + "/cms/6ad645b0-05ee-11ec-9004-860be6527422.webp")
          .headers(headers_10),
        http("request_331")
          .get(uri36)
          .headers(headers_10)
          .check(status.is(210)),
        http("request_332")
          .get(uri27 + "?id=GTM-PTM8PD")
          .headers(headers_10),
        http("request_333")
          .get(uri35 + "/api_static.js")
          .headers(headers_10),
        http("request_334")
          .get(uri37 + "/cms/46df07f2-cf69-11eb-8dfe-ea9ed3d03cf3.webp")
          .headers(headers_10),
        http("request_335")
          .get(uri37 + "/p/ea79f3aca1d598fdad4c52b3285640dd-product.webp")
          .headers(headers_10),
        http("request_336")
          .get(uri37 + "/cms/d768e81c-a938-11eb-986e-a22e373dfe30.webp")
          .headers(headers_10),
        http("request_337")
          .get(uri37 + "/p/0d4245e5b447535da377b12de3413daf-product.webp")
          .headers(headers_10),
        http("request_338")
          .get(uri37 + "/cms/0febb2e2-ed3b-11ea-b3a7-4afca18a6672.webp")
          .headers(headers_10),
        http("request_339")
          .get(uri37 + "/p/3ca4c54408c2892b4e941bc75ae2c2d7-product.webp")
          .headers(headers_10),
        http("request_340")
          .get(uri37 + "/p/0d886d88e616512a59e520f5224b92ee-product.webp")
          .headers(headers_10),
        http("request_341")
          .get(uri37 + "/p/3c0a8d2bc5d46bbcd180c08b8237a243-product.webp")
          .headers(headers_10),
        http("request_342")
          .get(uri37 + "/p/c0cd3d1d857e2443d3c47d9c0539205a-product.webp")
          .headers(headers_10),
        http("request_343")
          .get(uri37 + "/cms/512b8d6a-55e4-11eb-bf1f-e673225b7336.webp")
          .headers(headers_10),
        http("request_344")
          .get(uri37 + "/p/ede4bf5b3b31286df5807c9c8bb738ee-product.webp")
          .headers(headers_10),
        http("request_345")
          .get(uri37 + "/p/3cf0373144c064fa72ca0c286283b7b4-product.webp")
          .headers(headers_10),
        http("request_346")
          .get(uri37 + "/cms/1f215c6e-8489-11ea-9caa-ca3fed3fd0ef.webp")
          .headers(headers_10),
        http("request_347")
          .get(uri37 + "/p/ae0810033b6fd5cc0455f8cd6fb4577a-product.webp")
          .headers(headers_10),
        http("request_348")
          .get(uri37 + "/p/e3cb4db953b52db97edb81635c827afe-product.webp")
          .headers(headers_10),
        http("request_349")
          .get(uri37 + "/cms/330c3294-8489-11ea-8526-1ea4d6a3f68d.webp")
          .headers(headers_10),
        http("request_350")
          .get(uri37 + "/p/ccdb23ffc679f0b64b13246092a42a78-product.webp")
          .headers(headers_10),
        http("request_351")
          .get(uri37 + "/p/a5ee5793d375876dacc61acc8de56cda-product.webp")
          .headers(headers_10),
        http("request_352")
          .get(uri37 + "/cms/4e64e2d6-4a02-11eb-a900-e2a98cf53925.webp")
          .headers(headers_10),
        http("request_353")
          .get(uri37 + "/p/3f6b447c68d30e0e1b7e8caa7bd49cf4-product.webp")
          .headers(headers_10),
        http("request_354")
          .get(uri37 + "/cms/354b9752-8489-11ea-b3d5-ca3fed3fd0ef.webp")
          .headers(headers_10),
        http("request_355")
          .get(uri37 + "/p/913b7e6dc04b920055d5e914bb370a34-product.webp")
          .headers(headers_10),
        http("request_356")
          .get(uri37 + "/p/80313892d99f3c658bec1b1b504b2a92-product.webp")
          .headers(headers_10),
        http("request_357")
          .get(uri37 + "/cms/5d45b5de-4a05-11eb-ab10-e673225b7336.webp")
          .headers(headers_10),
        http("request_358")
          .get(uri37 + "/cms/8cfb4db2-f486-11eb-acbe-168c0a9d1b5d.webp")
          .headers(headers_10),
        http("request_359")
          .get(uri37 + "/p/4eeb206c8617402eedbec21782482333-product.webp")
          .headers(headers_10),
        http("request_360")
          .get(uri37 + "/p/f19f6a7d0d402fdbcb5bf4f9a99b312b-product.webp")
          .headers(headers_10),
        http("request_361")
          .get(uri37 + "/p/066d0a5f5c2deafe83e85fca502ed2ba-product.webp")
          .headers(headers_10),
        http("request_362")
          .get(uri37 + "/cms/eb2201e2-503a-11eb-9571-e673225b7336.webp")
          .headers(headers_10),
        http("request_363")
          .get(uri37 + "/p/9cc4b07a7816f8444c13498b19987e82-product.webp")
          .headers(headers_10),
        http("request_364")
          .get(uri37 + "/cms/79bdf42c-55a6-11eb-9816-e673225b7336.webp")
          .headers(headers_10),
        http("request_365")
          .get(uri37 + "/p/54b19e86d2d727d8913360770080dcd8-product.webp")
          .headers(headers_10),
        http("request_366")
          .get(uri37 + "/p/c21213bc4422166be5a70650926eb552-product.webp")
          .headers(headers_10),
        http("request_367")
          .get(uri37 + "/p/e8d80934daf5b38058d1a01c17b8fdb8-product.webp")
          .headers(headers_10),
        http("request_368")
          .get(uri37 + "/cms/1c13e99e-55a6-11eb-ba7d-e2a98cf53925.webp")
          .headers(headers_10),
        http("request_369")
          .get(uri37 + "/p/8d2b569a322fa84f1a7c7237be36c4a3-product.webp")
          .headers(headers_10),
        http("request_370")
          .get(uri37 + "/p/e0cd7a5e04ad8cb71d88e6f7dd6520c6-product.webp")
          .headers(headers_10),
        http("request_371")
          .get(uri37 + "/p/520984bf7b3ac274d4f8c0fe554a0917-product.webp")
          .headers(headers_10),
        http("request_372")
          .get(uri37 + "/cms/886ca0ce-ee1a-11eb-aeef-1a0d3920135d.webp")
          .headers(headers_10),
        http("request_373")
          .get(uri37 + "/p/c9b3551c86eb81b3e7e006f8efcd0064-product.webp")
          .headers(headers_10),
        http("request_374")
          .get(uri37 + "/p/72251501b6b1e1189beb000f4feecc68-product.webp")
          .headers(headers_10),
        http("request_375")
          .get(uri37 + "/p/b6bf055df5c49ff9b06d5909e69eae5b-product.webp")
          .headers(headers_10),
        http("request_376")
          .get(uri37 + "/cms/4f7f62c2-ee1c-11eb-a0a1-c6d6a10dff4c.webp")
          .headers(headers_10),
        http("request_377")
          .get(uri37 + "/p/087b1718f1a77ea7350df879500657ce-product.webp")
          .headers(headers_10),
        http("request_378")
          .get(uri37 + "/p/d056d2c89cfad99616886dfda391aa2a-product.webp")
          .headers(headers_10),
        http("request_379")
          .get(uri37 + "/p/7ebbc85c5f7fa0a67e2b09ebfe0629f2-product.webp")
          .headers(headers_10),
        http("request_380")
          .get(uri37 + "/cms/35af18de-5aaf-11eb-9c4c-e2a98cf53925.webp")
          .headers(headers_10),
        http("request_381")
          .get(uri37 + "/p/584ace4036c43afd233cfd9a1247004b-product.webp")
          .headers(headers_10),
        http("request_382")
          .get(uri37 + "/p/8806a42de53c94eb119d896bef294c5e-product.webp")
          .headers(headers_10),
        http("request_383")
          .get(uri37 + "/p/a6560fae81766b1dce4228e6496070e1-product.webp")
          .headers(headers_10),
        http("request_384")
          .get(uri37 + "/cms/0dd9be30-d5da-11eb-834f-96a0bacba68a.webp")
          .headers(headers_10),
        http("request_385")
          .get(uri37 + "/p/2f7e422bb7ffc4c9429b625683882aa3-product.webp")
          .headers(headers_10),
        http("request_386")
          .get(uri37 + "/p/fa610780faf78f7a08baf6de147d0f16-product.webp")
          .headers(headers_10),
        http("request_387")
          .get(uri37 + "/cms/7a518a78-8489-11ea-979c-ca3fed3fd0ef.webp")
          .headers(headers_10),
        http("request_388")
          .get(uri37 + "/p/efdd258d79d8ba0f27161d9417a64e55-product.webp")
          .headers(headers_10),
        http("request_389")
          .get(uri37 + "/cms/12912064-60cb-11eb-a49e-e673225b7336.webp")
          .headers(headers_10),
        http("request_390")
          .get(uri37 + "/p/4160f258cdd6965d5043a451aa28a95d-product.webp")
          .headers(headers_10),
        http("request_391")
          .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
          .headers(headers_10),
        http("request_392")
          .get(uri35 + "/api_dynamic.js")
          .headers(headers_10),
        http("request_393")
          .get(uri09 + "/assets/sprites/alice-2330db5b1f-87b340fa20.png")
          .headers(headers_10),
        http("request_394")
          .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
          .headers(headers_10),
        http("request_395")
          .get(uri10 + "/api/order/stats")
          .headers(headers_11),
        http("request_396")
          .get("/analytics.js")
          .headers(headers_10),
        http("request_397")
          .get(uri24)
          .headers(headers_10),
        http("request_398")
          .get(uri39 + "/conversion_async.js")
          .headers(headers_10),
        http("request_399")
          .get(uri33 + "/tm/?t=linio.cl")
          .headers(headers_10),
        http("request_400")
          .get(uri11)
          .headers(headers_10),
        http("request_401")
          .get(uri17 + "?tag=linio-cl-general")
          .headers(headers_10),
        http("request_402")
          .get(uri20)
          .headers(headers_10),
        http("request_403")
          .get(uri40 + "/OneSignalSDK.js")
          .headers(headers_10),
        http("request_404")
          .get(uri41 + "/scripts/0013/6709.js")
          .headers(headers_2),
        http("request_405")
          .get(uri34)
          .headers(headers_2),
        http("request_406")
          .get("/plugins/ua/ec.js")
          .headers(headers_10),
        http("request_407")
          .get("/gtm/js?id=OPT-NNG2275&t=gtm13&cid=710969180.1630205515&gac=_gaexp%3DGAX1.2.edOKrHSKRpG_QJZ8lfKlYA.18950.1")
          .headers(headers_10),
        http("request_408")
          .get(uri08)
          .headers(headers_10),
        http("request_409")
          .get(uri41 + "/data-scripts/0013/6709.json?t=1")
          .headers(headers_29),
        http("request_410")
          .get(uri22 + "?sec=8767679&inHead=true&id=6674335104659813962&jsession=j81zq7ycwpsq2q27bqqy3mcfmvvltuqr&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&scriptVersion=1.28.3&dyid_server=&ctx=%7B%22type%22%3A%22HOMEPAGE%22%7D")
          .headers(headers_2),
        http("request_411")
          .get(uri04 + "?&t=1")
          .headers(headers_10),
        http("request_414")
          .get(uri40 + "/OneSignalPageSDKES6.js?v=151507")
          .headers(headers_10),
        http("request_416")
          .get(uri41 + "/versioned/common-scripts/11.1.331.js")
          .headers(headers_10),
        http("request_417")
          .get(uri07 + "/scripts/1.28.3/dy-coll-nojq-min.js")
          .headers(headers_10),
        http("request_419")
          .get(uri29 + "/1p-user-list/969755919/?random=1630205549418&cv=9&fst=1630202400000&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&async=1&fmt=3&is_vtc=1&random=2379856208&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
          .headers(headers_3),
        http("request_420")
          .get(uri30 + "/1p-user-list/1004172317/?random=1630205549451&cv=9&fst=1630202400000&num=1&guid=ON&eid=376635471&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&async=1&fmt=3&is_vtc=1&random=4212770951&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
          .headers(headers_3),
        http("request_421")
          .get(uri29 + "/1p-user-list/1004172317/?random=1630205549451&cv=9&fst=1630202400000&num=1&guid=ON&eid=376635471&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&async=1&fmt=3&is_vtc=1&random=4212770951&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
          .headers(headers_3),
        http("request_422")
          .get(uri39 + "/conversion/963429843/?random=1630205549649&cv=9&fst=1630205549649&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
          .headers(headers_2),
        http("request_423")
          .get(uri30 + "/1p-user-list/969755919/?random=1630205549418&cv=9&fst=1630202400000&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&async=1&fmt=3&is_vtc=1&random=2379856208&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
          .headers(headers_3),
        http("request_425")
          .get("/collect?v=1&_v=j93&a=1988849774&t=pageview&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&xid=0&xvar=0&exp=edOKrHSKRpG_QJZ8lfKlYA.1&_u=SCCAgEILQ~&jid=&gjid=&cid=710969180.1630205515&uid=2c1aadaa-0811-11ec-8a2b-028845068c9f&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205549798.79rsga28&cd4=146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2&cd14=2c1aadaa-0811-11ec-8a2b-028845068c9f&z=1096375188")
          .headers(headers_3),
        http("request_426")
          .get(uri26 + "?google_nid=mainad_comunicacoes_ltda&google_ula=1060335013&google_cm&cok15=$CookieName$&cnty15=$GRegionCode$&ProgramName=Linio_CL&AudienceId=826&CampaignId=0&Referrer=https%3A%2F%2Fwww.linio.cl%2F&pagetype=home&Browsercheck=true")
          .headers(headers_56),
        http("request_427")
          .get(uri18 + "?a=14897&v=5.7.1&p0=e%3Dexd%26ci%3D146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2%26site_type%3Dd&p1=e%3Dvh&p2=e%3Ddis&adce=1&tld=linio.cl&dtycbr=73678")
          .headers(headers_2),
        http("request_428")
          .get(uri18 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd%26ci%3D146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2&p1=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=45602")
          .headers(headers_2),
        http("request_429")
          .get(uri26 + "?google_nid=mainad_comunicacoes_ltda&google_ula=1060335013&google_cm=&cok15=$CookieName$&cnty15=$GRegionCode$&ProgramName=Linio_CL&AudienceId=826&CampaignId=0&Referrer=https%3A%2F%2Fwww.linio.cl%2F&pagetype=home&Browsercheck=true&google_tc=")
          .headers(headers_56),
        http("request_430")
          .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq_home&id=pr_Ep0NkTU4joacylgRKAPq_lid_YhgZj32HC2Xx9mLYS4ft&su=https%3A%2F%2Fwww.linio.cl%2F&sr=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ts=1630205549290")
          .headers(headers_56),
        http("request_432")
          .get(uri15 + "?id=mainad_comunicacoes_ltda&cok15=$CookieName$&cnty15=$GRegionCode$&ProgramName=Linio_CL&AudienceId=826&CampaignId=0&Referrer=https%3A%2F%2Fwww.linio.cl%2F&pagetype=home&Browsercheck=true&google_error=3")
          .headers(headers_56),
        http("request_433")
          .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq_home&id=pr_Ep0NkTU4joacylgRKAPq_lid_YhgZj32HC2Xx9mLYS4ft&su=https%3A%2F%2Fwww.linio.cl%2F&sr=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ts=1630205549290&tc=1")
          .headers(headers_56),
        http("request_434")
          .get(uri03 + "/42fa44bc-c9bc-11e9-a351-52dc582f5ff5.png")
          .headers(headers_10),
        http("request_435")
          .get(uri37 + "/p/fac00b2d2ce1b80b3a8c8f9407520e4f-product.webp")
          .headers(headers_10),
        http("request_436")
          .get(uri03 + "/0d16929e-c9bf-11e9-a45a-52dc582f5ff5.png")
          .headers(headers_10),
        http("request_438")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/361d9c967cae2__onbb_welcome_nuevosusuarios_cl.jpg")
          .headers(headers_10),
        http("request_439")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1f5c32beffc62__onbb_compras_nuevosusuarios_co.jpg")
          .headers(headers_10),
        http("request_440")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2fa941943b5b0__5adbbc1e-043e-11ec-989a-860be6527422.jpg")
          .headers(headers_10),
        http("request_441")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2e79c5a38cbf3__190x91_gadgets_1.jpg")
          .headers(headers_10),
        http("request_442")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/25a0ef8e41206__190x91_celulares_1.jpg")
          .headers(headers_10),
        http("request_443")
          .get(uri03 + "/482519c2-eb06-11eb-81fc-c6d6a10dff4c.png")
          .headers(headers_10),
        http("request_444")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2a1d8222692d7__190x91_coleccionables_1.jpg")
          .headers(headers_10),
        http("request_449")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1c160d58ccdef__190x91_hogar_1.jpg")
          .headers(headers_10),
        http("request_450")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/33bfece0e4580__190x91_computing.jpg")
          .headers(headers_10),
        http("request_451")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1a8c554a0f7d__190x91_electrodomesticos_1.jpg")
          .headers(headers_10),
        http("request_454")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/27a48df42b5b0__on_ts1.jpg")
          .headers(headers_10),
        http("request_457")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2418f5b9f7b5e__a41b402303e2_on_bb4.jpg")
          .headers(headers_10),
        http("request_458")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1a244e1eedca6__on_ts2.jpg")
          .headers(headers_10),
        http("request_459")
          .get("/collect?v=1&_v=j93&a=1988849774&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%203&el=H%7CB%7CC3-3%7CG%7CNA%7CW35-Ciclismo%20(H%7CB%7CC3-3%7CG%7CNA%7CW35-Ciclismo)&xid=0&xvar=0&_u=SCCACEILR~&jid=&gjid=&cid=710969180.1630205515&uid=2c1aadaa-0811-11ec-8a2b-028845068c9f&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205550264.vz60tzmi&cd4=146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2&cd14=2c1aadaa-0811-11ec-8a2b-028845068c9f&z=188465069")
          .headers(headers_3),
        http("request_460")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/340b1cefc54c3__hd_on_cl_promotionalcmr.jpg")
          .headers(headers_10),
        http("request_463")
          .post(uri13 + "/p")
          .headers(headers_90)
          .body(RawFileBody("recordedsimulation/0463_request.txt")),
        http("request_464")
          .post(uri13 + "/t")
          .headers(headers_90)
          .body(RawFileBody("recordedsimulation/0464_request.txt")),
        http("request_465")
          .get("/collect?v=1&_v=j93&a=1988849774&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Action&ea=Cart%20Notification&el=Items%20in%20Cart%20Reminder%20-%20Over%20(Variation%201)&xid=0&xvar=0&_u=SCCACEILR~&jid=&gjid=&cid=710969180.1630205515&uid=2c1aadaa-0811-11ec-8a2b-028845068c9f&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205550358.k63yf18v&cd4=146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2&cd14=2c1aadaa-0811-11ec-8a2b-028845068c9f&z=770652317")
          .headers(headers_3),
        http("request_466")
          .get(uri29 + "/1p-conversion/963429843/?random=993365515&cv=9&fst=1630205549649&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=bfYqYeiHI4_goAPFjYWoDw&random=2123527674&resp=GooglemKTybQhCsO")
          .headers(headers_3),
        http("request_467")
          .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd%26ci%3D146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2&p1=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=45602")
          .headers(headers_2),
        http("request_468")
          .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dvh&p1=e%3Dexd%26ci%3D146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2%26site_type%3Dd&p2=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=76050")
          .headers(headers_2),
        http("request_469")
          .get(uri30 + "/1p-conversion/963429843/?random=993365515&cv=9&fst=1630205549649&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=&is_vtc=1&ocp_id=bfYqYeiHI4_goAPFjYWoDw&random=2123527674&resp=GooglemKTybQhCsO&ipr=y")
          .headers(headers_3),
        http("request_470")
          .get(uri21 + "?a=14897&v=5.7.1&p0=e%3Dexd%26ci%3D146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2%26site_type%3Dd&p1=e%3Dvh&p2=e%3Ddis&adce=1&tld=linio.cl&dtycbr=73678")
          .headers(headers_2),
        http("request_475")
          .post(uri10 + "/api/catalog/personalized-feed/Row%203%20-%20Recomendaciones/homepage")
          .headers(headers_475),
        http("request_476")
          .post(uri10 + "/api/catalog/personalized-feed/Row%204%20-%20Recomendaciones/homepage")
          .headers(headers_475),
        http("request_477")
          .get(uri37 + "/p/27f738d915547509ffd5e329dfad4081-card.webp")
          .headers(headers_10),
        http("request_478")
          .get(uri37 + "/p/10059aaf4fa3d6a98f4a88e79d29c447-card.webp")
          .headers(headers_10),
        http("request_479")
          .get(uri37 + "/p/e10e8c290c1962b55d2aa97d4b0219a8-card.webp")
          .headers(headers_10),
        http("request_480")
          .get(uri37 + "/p/6865b748205b107b445edbcc0e4c01de-card.webp")
          .headers(headers_10),
        http("request_481")
          .get(uri37 + "/p/1291350fe5f648d02af986e2af8b0004-card.webp")
          .headers(headers_10),
        http("request_482")
          .get(uri37 + "/p/2d0cc54d4526e749a0a541585f6b4ccf-card.webp")
          .headers(headers_10),
        http("request_483")
          .get(uri37 + "/p/691c676c0528bf25388bb3d41bc62bf7-card.webp")
          .headers(headers_10),
        http("request_484")
          .get(uri37 + "/p/538eb50c75b20361e577fa89db982253-card.webp")
          .headers(headers_10),
        http("request_485")
          .get(uri37 + "/p/9e93ccc63db1f294329a47accfdd0198-card.webp")
          .headers(headers_10),
        http("request_486")
          .get(uri37 + "/p/1803ef5bf015a9bd4dc827816005034f-card.webp")
          .headers(headers_10),
        http("request_487")
          .get(uri37 + "/p/6b82d3178c4d688692debafc7691ad96-card.webp")
          .headers(headers_10),
        http("request_488")
          .get(uri37 + "/p/0c78b816e4f3e3c924f7c5cec20a3dc2-card.webp")
          .headers(headers_10),
        http("request_489")
          .get(uri37 + "/p/eaa2d53678990b0387c2b7d2e5661bf9-card.webp")
          .headers(headers_10),
        http("request_490")
          .get(uri37 + "/p/81a80a875773108720445306a65a83ec-card.webp")
          .headers(headers_10),
        http("request_491")
          .get(uri37 + "/p/c1e0f64491e21bde5fc6e137a6d7ff08-card.webp")
          .headers(headers_10),
        http("request_492")
          .post(uri10 + "/api/catalog/personalized-feed/Row%202%20-%20Recomendaciones/homepage")
          .headers(headers_475),
        http("request_493")
          .post(uri10 + "/api/catalog/personalized-feed/Row%205%20-%20Recomendaciones/homepage")
          .headers(headers_475),
        http("request_495")
          .get(uri37 + "/p/6694ad7dbc88cef71999280b83ed6b15-card.webp")
          .headers(headers_3),
        http("request_496")
          .get(uri37 + "/p/3b6b6b2e86033ebd76efe2e5a7ff5150-card.webp")
          .headers(headers_3),
        http("request_497")
          .get(uri37 + "/p/2b50f522e7e942be6e4f4d156c0fa0c2-card.webp")
          .headers(headers_3),
        http("request_498")
          .get(uri37 + "/p/e9c62f25ddb3ec50b317f32ea86336e1-card.webp")
          .headers(headers_10),
        http("request_499")
          .get(uri37 + "/p/e66d8a72e85adb4c6e0a21ec5b0af7a7-card.webp")
          .headers(headers_10),
        http("request_500")
          .get(uri37 + "/p/da9de7b6cdeafd712c04873b982d8e94-card.webp")
          .headers(headers_3),
        http("request_501")
          .post(uri10 + "/api/catalog/personalized-feed/Row%201%20-%20Recomendaciones/homepage")
          .headers(headers_475),
        http("request_502")
          .get(uri37 + "/p/e38d4a77175b8ef44a3c3cb0da9286f5-card.webp")
          .headers(headers_3),
        http("request_503")
          .get(uri37 + "/p/1bf3c405da995b49205b7088b63482c3-card.webp")
          .headers(headers_3),
        http("request_504")
          .get(uri37 + "/p/3c4db813c863b261103680fcc1c3960a-card.webp")
          .headers(headers_10),
        http("request_505")
          .get(uri37 + "/p/d66b998c0423b0433587a25b90bed367-card.webp")
          .headers(headers_3),
        http("request_506")
          .get(uri37 + "/p/dc5fdd180749b0062bce6cddb8b96d76-card.webp")
          .headers(headers_3),
        http("request_507")
          .get(uri37 + "/p/e33b8424659781afcc72dec4635aeb89-card.webp")
          .headers(headers_3),
        http("request_509")
          .get(uri37 + "/p/5c3d1831c54f50818648fb16c3b134db-card.webp")
          .headers(headers_3),
        http("request_510")
          .get(uri37 + "/p/3bec36d2b98e66ec7a4bf3f0f3413044-card.webp")
          .headers(headers_3),
        http("request_511")
          .get(uri37 + "/p/915d6ed5805a81e848b9a605c10721bc-card.webp")
          .headers(headers_3),
        http("request_512")
          .get(uri37 + "/p/d0eab973742a6324ebc99df8a7b1067a-card.webp")
          .headers(headers_10),
        http("request_513")
          .get(uri37 + "/p/4b84aa7a8bb6230963fc057a1f54af5b-card.webp")
          .headers(headers_3),
        http("request_514")
          .get(uri37 + "/p/d4c88b43c1a9f1ae8cc04cfea8c04ed9-card.webp")
          .headers(headers_10),
        http("request_515")
          .get(uri37 + "/p/187612f9e3cedc7e6782fe2277d94a71-card.webp")
          .headers(headers_3),
        http("request_516")
          .get(uri37 + "/p/475ca316084c800e33be57d0889949ef-card.webp")
          .headers(headers_10),
        http("request_517")
          .get(uri37 + "/p/c0cd3d1d857e2443d3c47d9c0539205a-card.webp")
          .headers(headers_10),
        http("request_518")
          .get(uri37 + "/p/3e4a77a0f95e73bf9a072fbff537e0cc-card.webp")
          .headers(headers_10),
        http("request_519")
          .get(uri37 + "/p/865d1dea777086c4c23ee785eb6fda8e-card.webp")
          .headers(headers_10),
        http("request_526")
          .get(uri37 + "/p/889471a66c6d9b1eb506a7e27b8b5f40-card.webp")
          .headers(headers_3),
        http("request_527")
          .get(uri37 + "/p/4666e39b4a034650a30560aeb7ff87e1-card.webp")
          .headers(headers_3),
        http("request_528")
          .get(uri37 + "/p/be7129327e1ae86c56639afc41665c5b-card.webp")
          .headers(headers_3),
        http("request_529")
          .get(uri37 + "/p/f03a7278ea669d1e50b3f796b8e8e694-card.webp")
          .headers(headers_3),
        http("request_531")
          .get(uri37 + "/p/1eededaef55cfc5f9d012ad17a6c7d48-card.webp")
          .headers(headers_10),
        http("request_532")
          .get(uri37 + "/p/f3d7db34536ee8b8d02f561e0bf99e47-card.webp")
          .headers(headers_10),
        http("request_533")
          .get(uri37 + "/p/535579cc9f6bcb1500699fe7b9f184ac-card.webp")
          .headers(headers_10),
        http("request_534")
          .get(uri37 + "/p/a7ede4cd8cdcc99566db21bad29e445d-card.webp")
          .headers(headers_10),
        http("request_535")
          .get(uri37 + "/p/94bda0a8b4c6d88a5b9203e3934db21b-card.webp")
          .headers(headers_10),
        http("request_536")
          .get(uri37 + "/p/8e69ee33514b3be763db02ad7f4676f8-card.webp")
          .headers(headers_10),
        http("request_537")
          .get(uri37 + "/p/abf8f725e7a19cb064badd9d8fcaf7ba-card.webp")
          .headers(headers_10),
        http("request_538")
          .get(uri37 + "/p/ae8a13a43b5217a50a495b2d886192dc-card.webp")
          .headers(headers_3),
        http("request_539")
          .get(uri37 + "/p/bf644e756b61f233cb2c3394f24480c0-card.webp")
          .headers(headers_3),
        http("request_540")
          .get(uri37 + "/p/f9a4d32585beb3678dd9cf75bf0a5320-card.webp")
          .headers(headers_3),
        http("request_541")
          .get(uri37 + "/p/3d45a25ad4c88c81d9a2d670b50e6ed5-card.webp")
          .headers(headers_10),
        http("request_542")
          .get(uri37 + "/p/8d82a6ab3ca03303aa74f872df07bd75-card.webp")
          .headers(headers_3),
        http("request_543")
          .get(uri37 + "/p/f86188a11f4d842b77b37b5fccf1e80d-card.webp")
          .headers(headers_10),
        http("request_544")
          .get(uri37 + "/p/5cff86bb95829adf3d0fccd5606df41a-card.webp")
          .headers(headers_3),
        http("request_545")
          .get(uri37 + "/p/fdbfe127d2de9a32baefd175b59d728d-card.webp")
          .headers(headers_3),
        http("request_546")
          .get(uri37 + "/p/4146bce4fee63b5499a5b2018c38ca36-card.webp")
          .headers(headers_10),
        http("request_547")
          .get(uri37 + "/p/4441687924dd4607d13be48290e11e3e-card.webp")
          .headers(headers_10),
        http("request_548")
          .get(uri37 + "/p/0b88b3b0f0b1a39284515f36dfca8a1c-card.webp")
          .headers(headers_10),
        http("request_549")
          .get(uri37 + "/p/90107469be839435aa1f75e5f347c661-card.webp")
          .headers(headers_10),
        http("request_550")
          .get(uri37 + "/p/bac3e2cc3677bdedce8aa8950e2d3a9f-card.webp")
          .headers(headers_3),
        http("request_551")
          .get(uri37 + "/p/93b92db0d29c3ac19bf89d1ac6e4b210-card.webp")
          .headers(headers_10),
        http("request_552")
          .get(uri37 + "/p/f8b19aefc22e820da3dd7b177d15494b-card.webp")
          .headers(headers_3),
        http("request_553")
          .get(uri37 + "/p/ae6d7b3fe8228d968c6183723f45e64f-card.webp")
          .headers(headers_3),
        http("request_554")
          .get(uri37 + "/p/b5153c207a71a76e25ea5bd576c08c3a-card.webp")
          .headers(headers_3),
        http("request_555")
          .get(uri37 + "/p/bc4c8e71e0000eb1d43a014bf3d23855-card.webp")
          .headers(headers_3),
        http("request_556")
          .get(uri37 + "/p/e5fb19fa23fcf0dfcb239e4d4be9f098-card.webp")
          .headers(headers_3),
        http("request_557")
          .get(uri37 + "/p/b1d3633141757b8fc70e68e1c54bbb2e-card.webp")
          .headers(headers_10),
        http("request_558")
          .get(uri37 + "/p/2959f5d02cea365bb1b5591609c6e1ab-card.webp")
          .headers(headers_10),
        http("request_559")
          .get(uri37 + "/p/520984bf7b3ac274d4f8c0fe554a0917-card.webp")
          .headers(headers_3),
        http("request_560")
          .get(uri37 + "/p/54f388621ba73544f7ff57ef3189e3af-card.webp")
          .headers(headers_3),
        http("request_561")
          .get(uri37 + "/p/c074a8b499981bc2cc6c1784251c4cda-card.webp")
          .headers(headers_3),
        http("request_562")
          .get(uri37 + "/p/d2b704c5fe7620e89dfd887a805cf8e7-card.webp")
          .headers(headers_3),
        http("request_563")
          .get(uri37 + "/p/fb10bcb7bff584081239169beff6151c-card.webp")
          .headers(headers_3),
        http("request_564")
          .get(uri37 + "/p/4aed905671632a4395bf261b51316609-card.webp")
          .headers(headers_3)))
    .pause(3)
    .exec(http("request_570")
      .get(uri06 + "/sdks/OneSignalSDKStyles.css?v=2")
      .headers(headers_10))
    .pause(3)
    .exec(http("request_571")
      .get("/collect?v=1&_v=j93&a=1988849774&t=event&ni=1&cu=CLP&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=Ecommerce&ea=Impressions&el=&xid=0&xvar=0&_u=SCCACEILR~&jid=&gjid=&cid=710969180.1630205515&uid=2c1aadaa-0811-11ec-8a2b-028845068c9f&tid=UA-49693852-1&_gid=1585001852.1630205515&gtm=2wg8p0PTM8PD&cd3=1630205574475.eyc46w9s&cd4=146d4b3a490e92809ca35683e9b3b0071d7cad91518fbd1d166af1c8e52460d2&cd14=2c1aadaa-0811-11ec-8a2b-028845068c9f&promo1id=https%3A%2F%2Fdynamic-yield.linio.com%2F%2Fapi%2Fscripts%2F8767679%2Fimages%2F2418f5b9f7b5e__a41b402303e2_on_bb4.jpg%20%3A%3A%20https%3A%2F%2Fwww.linio.cl%2Fc%2Fmuebles%2Fmuebles-para-dormitorio%3Fskus%3DFL839HL1CYMP6LACL%2CAL286HL127FYHLACL%2CGE018HL1JNG1CLACL%2CMI586HL144UMYLACL%2CGE018HL0CZMIKLACL%2CCI733HL0H3QJULACL&promo1nm=Dormitorio&promo1ps=10%2F80&promo1cr=%2F%20%3A%3A%20home%20%3A%3A%20Dormitorio&z=1729781492")
      .headers(headers_3))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}