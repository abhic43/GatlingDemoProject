package myGatlingProject

import scala.concurrent.duration._
import io.gatling.core.Predef.{Simulation, _}
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.util.Random
class _002_Registration extends Simulation{



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
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_2 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "style",
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

  val headers_9 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-IN,en;q=0.9",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_14 = Map(
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_22 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_28 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-newrelic-id" -> "UwICVF5ACQIFVllRBAM=")

  val headers_37 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "iframe",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1")

  val headers_42 = Map(
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

  val headers_64 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-origin")

  val headers_78 = Map(
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

  val headers_91 = Map(
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

  val headers_110 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-IN,en;q=0.9",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_247 = Map(
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

  val headers_250 = Map(
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

  val headers_253 = Map(
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

  val headers_260 = Map(
    "Origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_263 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-IN,en;q=0.9",
    "origin" -> "https://www.linio.cl",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_327 = Map(
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

  val headers_474 = Map(
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
    "x-xsrf-token" -> "32347523783caed9d8.8aTuEDTIvHBCQvv-JwO5Fju0MTw9yrZblUzRoSaoK00.u-jeenCAjS8TEKy9UXreYmr-bg5X8t867D2r-BL5ShyB-4d0WqnbOgYtmA")

  val uri01 = "https://bam-cell.nr-data.net"
  val uri02 = "https://nova.collect.igodigital.com/c2/520000417/track_page_view"
  val uri03 = "https://s3.amazonaws.com/fms-live"
  val uri04 = "https://stats.g.doubleclick.net/j/collect"
  val uri05 = "https://cdn.mndtrk.com/aud/clientjs/826.js"
  val uri06 = "https://onesignal.com"
  val uri07 = "https://cdn.dynamicyield.com/scripts/1.28.3/dy-coll-nojq-min.js"
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

  val csvFeeder = csv("src/test/resources/Data/userRegistrationDetails.csv").eager.queue// CSV Contains : Email,FirstName,LastName,RUT with a  comma separator
  val feeder = Iterator.continually(Map("email" -> (Random.alphanumeric.take(20).mkString + "@gmail.com")))
  val scn = scenario("RecordedSimulation")
      .exec(http("LaunchHomePage")
      .get(uri10 + "/").check(status.is(expected = 200))
      .headers(headers_0)
      .resources(http("request_1")
        .get(uri09 + "/js/core-dfb5bbecaa.js")
        .headers(headers_1),
        http("request_2")
          .get(uri09 + "/css/alice-home-d5088827a7.css")
          .headers(headers_2),
        http("request_3")
          .get(uri09 + "/assets/images/logos/linio-by-fb-92fa2edd4c.svg")
          .headers(headers_3),
        http("request_4")
          .get(uri09 + "/assets/fonts/iconfont-linio-2f22b19d6b.woff2")
          .headers(headers_4),
        http("request_6")
          .get(uri09 + "/css/alice-53b710c6df.lazy.css")
          .headers(headers_2),
        http("request_7")
          .get(uri37 + "/cms/7c0dfdee-0415-11ec-8c5e-860be6527422.webp")
          .headers(headers_3),
        http("request_8")
          .get(uri37 + "/cms/6ad645b0-05ee-11ec-9004-860be6527422.webp")
          .headers(headers_3),
        http("request_9")
          .get(uri36)
          .headers(headers_9)
          .check(status.is(210)),
        http("request_11")
          .get(uri35 + "/api_static.js")
          .headers(headers_1),
        http("request_12")
          .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
          .headers(headers_3),
        http("request_13")
          .get(uri35 + "/api_dynamic.js")
          .headers(headers_1),
        http("request_14")
          .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
          .headers(headers_14),
        http("request_15")
          .get(uri41 + "/scripts/0013/6709.js")
          .headers(headers_1),
        http("request_16")
          .get(uri24)
          .headers(headers_1),
        http("request_17")
          .get(uri34)
          .headers(headers_1),
        http("request_18")
          .get(uri09 + "/assets/sprites/alice-2330db5b1f-87b340fa20.png")
          .headers(headers_3),
        http("request_19")
          .get(uri40 + "/OneSignalSDK.js")
          .headers(headers_1),
        http("request_20")
          .get("/analytics.js")
          .headers(headers_1),
        http("request_22")
          .get(uri41 + "/data-scripts/0013/6709.json?t=1")
          .headers(headers_22),
        http("request_23")
          .get("/plugins/ua/ec.js")
          .headers(headers_1),
        http("request_24")
          .get(uri41 + "/versioned/common-scripts/11.1.331.js")
          .headers(headers_1),
        http("request_25")
          .get(uri05 + "?&t=1")
          .headers(headers_1),
        http("request_26")
          .get(uri33 + "/tm/?t=linio.cl")
          .headers(headers_1),
        http("request_28")
          .get(uri10 + "/api/order/stats")
          .headers(headers_28),
        http("request_29")
          .get("/gtm/js?id=OPT-NNG2275&t=gtm13&cid=1624135901.1630209072")
          .headers(headers_1),
        http("request_30")
          .get(uri41 + "/sampling-data-scripts/0013/6709.json?t=452835")
          .headers(headers_22),
        http("request_32")
          .get(uri22 + "?sec=8767679&inHead=true&id=0&jsession=fq1hr8p9ighrpxejez6cgudsyv4buylg&ref=&scriptVersion=1.28.3&dyid_server=&ctx=%7B%22type%22%3A%22HOMEPAGE%22%7D")
          .headers(headers_1),
        http("request_34")
          .get(uri25 + "/1004172317/?random=1630209071612&cv=9&fst=1630209071612&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&ig=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
          .headers(headers_1),
        http("request_35")
          .get(uri10 + "/ng/mobile-menu")
          .headers(headers_28),
        http("request_36")
          .get(uri25 + "/969755919/?random=1630209071597&cv=9&fst=1630209071597&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&resp=GooglemKTybQhCsO&eid=376635471&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&ig=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
          .headers(headers_1),
        http("request_38")
          .get("/collect?v=1&_v=j93&a=1394465719&t=pageview&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&xid=0&xvar=0&exp=edOKrHSKRpG_QJZ8lfKlYA.1&_u=aGDAgEILQ~&jid=1393550829&gjid=1107727094&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209071812.e1kvqtkk&z=687032896")
          .headers(headers_3),
        http("request_39")
          .get(uri07)
          .headers(headers_1),
        http("request_41")
          .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq_home&id=pr_Ep0NkTU4joacylgRKAPq_lid_CCG4MhPZfWoInE2KQEjt&su=https%3A%2F%2Fwww.linio.cl%2F&sr=&ts=1630209071323")
          .headers(headers_37),
        http("request_43")
          .get(uri18 + "?a=14897&v=5.7.1&p0=e%3Dexd%26ci%3Dundefined%26site_type%3Dd&p1=e%3Dvh&p2=e%3Ddis%26a%3D%255B69657%252C14897%255D&adce=1&tld=linio.cl&dtycbr=68710")
          .headers(headers_1),
        http("request_46")
          .get(uri20)
          .headers(headers_1),
        http("request_49")
          .post("/j/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%202&el=Copy%20of%20H%7CB%7CV-2%7CG%7CNA%7CW35-Celulares%20(H%7CB%7CV-2%7CG%7CNA%7CW35-Celulares)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=1516061296&gjid=1597790291&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&_r=1&gtm=2wg8p0PTM8PD&cd3=1630209072100.d3yxo0qq&z=618790678")
          .headers(headers_42),
        http("request_50")
          .get(uri15 + "?id=mainad_comunicacoes_ltda&cok15=$CookieName$&cnty15=$GRegionCode$&ProgramName=Linio_CL&AudienceId=826&CampaignId=0&Referrer=https%3A%2F%2Fwww.linio.cl%2F&pagetype=home&Browsercheck=true&google_error=3")
          .headers(headers_37),
        http("request_51")
          .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq_home&id=pr_Ep0NkTU4joacylgRKAPq_lid_CCG4MhPZfWoInE2KQEjt&su=https%3A%2F%2Fwww.linio.cl%2F&sr=&ts=1630209071323&tc=1")
          .headers(headers_37),
        http("request_52")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%203&el=Nuevos%20usuarios%20-%20Todo%20a%20menos%20(Todo%20a%20menos)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072133.gb3uqjtl&z=1119839773")
          .headers(headers_3),
        http("request_53")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%205&el=Copy%20of%20H%7CB%7CV-5%7CG%7CNA%7CW34-Dormitorio%20(H%7CB%7CV-5%7CG%7CNA%7CW34-Dormitorio)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072186.55511mld&z=91758618")
          .headers(headers_3),
        http("request_54")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%204&el=Nuevos%20usuarios%20-%20Los%20m%C3%A1s%20vendidos%20(Los%20m%C3%A1s%20vendidos)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072159.vd1onwxo&z=2078924327")
          .headers(headers_3),
        http("request_55")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Test%20-%20Mini%20Teasers%20Optimizacion&el=Optimizacion%20-%20Usuarios%20nuevos%20(Control%20Group%3A%20No%20Action)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072224.f70604gj&z=1700222447")
          .headers(headers_3),
        http("request_56")
          .post(uri13 + "/t")
          .headers(headers_42)
          .body(RawFileBody("recordedsimulation/0056_request.txt")),
        http("request_57")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3EHeader%20Solo%20Hoy&el=Contador%206%20(Header%20con%20Contador)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072262.ltda3cg&z=1367670281")
          .headers(headers_3),
        http("request_58")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%201&el=H%7CB%7CC3-1%7CG%7CNA%7CW35-Fitness%20(H%7CB%7CC3-1%7CG%7CNA%7CW35-Fitness)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072304.wgh0otza&z=2106070091")
          .headers(headers_3),
        http("request_59")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%202&el=H%7CB%7CC3-2%7CG%7CNA%7CW35-Ropa%20(H%7CB%7CC3-2%7CG%7CNA%7CW35-Ropa%20deportiva)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072323.bvsol97q&z=606538929")
          .headers(headers_3),
        http("request_60")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%203&el=H%7CB%7CC3-3%7CG%7CNA%7CW35-Ciclismo%20(H%7CB%7CC3-3%7CG%7CNA%7CW35-Ciclismo)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072337.68g6x79o&z=2142830814")
          .headers(headers_3),
        http("request_61")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3EPromocional%202&el=H%7CB%7CL%7CG%7CNA%7CW34-acumulapuntosCMR%20(H%7CB%7CL%7CG%7CNA%7CW34-acumulapuntosCMR)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072351.loh50tcm&z=2048591093")
          .headers(headers_3),
        http("request_62")
          .post(uri13 + "/p")
          .headers(headers_42)
          .body(RawFileBody("recordedsimulation/0062_request.txt")),
        http("request_63")
          .get(uri37 + "/p/fac00b2d2ce1b80b3a8c8f9407520e4f-product.webp")
          .headers(headers_3),
        http("request_64")
          .get(uri32 + "/extra-resources?ti=Ep0NkTU4joacylgRKAPq")
          .headers(headers_64),
        http("request_66")
          .get(uri25 + "/963429843/?random=577418818&cv=9&fst=1630209071636&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&ocp_id=LwQrYZWlKZfGogOp0LKwBA&sscte=1&crd=")
          .headers(headers_3),
        http("request_67")
          .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Action&ea=Linio%20%7C%20Onsite%20%7C%20Desktop%20%7C%20Notification%20Pop-up&el=Popup%20cupon%2010%25%20dscto%20imp%20(vta%20nocturna%20%20imp%20cmr)&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209072492.qowobc4&z=1234234670")
          .headers(headers_3),
        http("request_68")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1f5c32beffc62__onbb_compras_nuevosusuarios_co.jpg")
          .headers(headers_3),
        http("request_69")
          .get(uri40 + "/OneSignalPageSDKES6.js?v=151507")
          .headers(headers_1),
        http("request_71")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2fa941943b5b0__5adbbc1e-043e-11ec-989a-860be6527422.jpg")
          .headers(headers_3),
        http("request_72")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1c160d58ccdef__190x91_hogar_1.jpg")
          .headers(headers_3),
        http("request_73")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/25a0ef8e41206__190x91_celulares_1.jpg")
          .headers(headers_3),
        http("request_74")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/33a38ace667fc__190x91_moda_1.jpg")
          .headers(headers_3),
        http("request_75")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2d5cb72be67b4__190x91_deporte_1.jpg")
          .headers(headers_3),
        http("request_76")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2e79c5a38cbf3__190x91_gadgets_1.jpg")
          .headers(headers_3),
        http("request_77")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1a8c554a0f7d__190x91_electrodomesticos_1.jpg")
          .headers(headers_3),
        http("request_78")
          .post(uri10 + "/api/catalog/personalized-feed/Row%203%20-%20Recomendaciones/homepage")
          .headers(headers_78),
        http("request_79")
          .get(uri23 + "/var?cnst=1&_=418103&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=368089&p=1&ve=3949560&va=%5B10596091%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585306572009774&mech=1&smech=null&eri=1&tsrc=Direct&reqts=1630209071397&rri=6779326")
          .headers(headers_22),
        http("request_81")
          .get(uri37 + "/cms/46df07f2-cf69-11eb-8dfe-ea9ed3d03cf3.webp")
          .headers(headers_3),
        http("request_82")
          .get(uri37 + "/p/ea79f3aca1d598fdad4c52b3285640dd-product.webp")
          .headers(headers_3),
        http("request_83")
          .post(uri10 + "/api/catalog/personalized-feed/Row%202%20-%20Recomendaciones/homepage")
          .headers(headers_78),
        http("request_84")
          .post(uri23 + "/uia?cnst=1&_=1630209072061")
          .headers(headers_22)
          .formParam("msn", "webserve-7d22c79.use")
          .formParam("id", "-3030922298482031569")
          .formParam("se", "8767679")
          .formParam("cl", "dk.w.c.ms.")
          .formParam("rf", "")
          .formParam("trf", "0")
          .formParam("p", "1")
          .formParam("sub", "www.linio.cl")
          .formParam("sd", "")
          .formParam("url", "https://www.linio.cl/")
          .formParam("title", "Linio Chile I Grandes ofertas y promociones todo el año")
          .formParam("lay", "def")
          .formParam("ses", "527763133d467336e8964dde46a59047")
          .formParam("aud", "1474935.401657.401659.680587")
          .formParam("svars", "1359:@:false.@.1360:@:false.@.1423:@:false")
          .formParam("gv", "")
          .formParam("exps", """[["224534","8989788","6772166",0,null,null,"3913585303591300795","2","3"],["368089","3949560","10596091",0,null,null,"3913585306572009774","1",null]]""")
          .formParam("lts", "9:21")
          .formParam("ctx", """{"type":"HOMEPAGE"}""")
          .formParam("lpInfo", "false")
          .formParam("expSes", "7888")
          .formParam("br", "Other")
          .formParam("tsrc", "Direct")
          .formParam("geoData", "IN_MH_Pune")
          .formParam("feedProps[categories]", "")
          .formParam("feedProps[keywords]", "")
          .formParam("cookieInfo", "0.0.0")
          .formParam("reqts", "1630209072035")
          .formParam("rri", "5654022")
          .formParam("nocks", "false"),
        http("request_85")
          .post(uri10 + "/api/catalog/personalized-feed/Row%205%20-%20Recomendaciones/homepage")
          .headers(headers_78),
        http("request_86")
          .get(uri37 + "/p/0d4245e5b447535da377b12de3413daf-product.webp")
          .headers(headers_3),
        http("request_87")
          .post(uri10 + "/api/catalog/personalized-feed/Row%201%20-%20Recomendaciones/homepage")
          .headers(headers_78),
        http("request_88")
          .get(uri21 + "?a=14897&v=5.7.1&p0=e%3Dexd%26ci%3Dundefined%26site_type%3Dd&p1=e%3Dvh&p2=e%3Ddis%26a%3D%255B69657%252C14897%255D&adce=1&tld=linio.cl&dtycbr=68710")
          .headers(headers_1),
        http("request_89")
          .get(uri21 + "?a=14897&v=5.7.1&p0=e%3Dvh&p1=e%3Dexd%26site_type%3Dd%26ci%3Dundefined&p2=e%3Ddis%26a%3D%255B69657%252C14897%255D&adce=1&tld=linio.cl&dtycbr=31390")
          .headers(headers_1),
        http("request_90")
          .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd&p1=e%3Ddis&adce=1&tld=linio.cl&dtycbr=17963")
          .headers(headers_1),
        http("request_91")
          .post(uri23 + "/batch?cnst=1&_=1630209072527_185931")
          .headers(headers_91)
          .body(RawFileBody("recordedsimulation/0091_request.txt")),
        http("request_92")
          .get(uri23 + "/var?cnst=1&_=532854&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=339530&p=1&ve=3704074&va=%5B9870482%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585305388467307&mech=1&smech=null&eri=1&tsrc=Direct&reqts=1630209071545&rri=7458144")
          .headers(headers_22),
        http("request_95")
          .post(uri23 + "/batch?cnst=1&_=1630209072631_784220")
          .headers(headers_91)
          .body(RawFileBody("recordedsimulation/0095_request.txt")),
        http("request_96")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2418f5b9f7b5e__a41b402303e2_on_bb4.jpg")
          .headers(headers_3),
        http("request_97")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/27a48df42b5b0__on_ts1.jpg")
          .headers(headers_3),
        http("request_98")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/31ca7a7d4bb0e__on_ts3.jpg")
          .headers(headers_3),
        http("request_99")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1a244e1eedca6__on_ts2.jpg")
          .headers(headers_3),
        http("request_100")
          .get(uri37 + "/cms/d768e81c-a938-11eb-986e-a22e373dfe30.webp")
          .headers(headers_3),
        http("request_101")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/340b1cefc54c3__hd_on_cl_promotionalcmr.jpg")
          .headers(headers_3),
        http("request_102")
          .get(uri37 + "/cms/0febb2e2-ed3b-11ea-b3a7-4afca18a6672.webp")
          .headers(headers_3),
        http("request_103")
          .get(uri37 + "/p/0d886d88e616512a59e520f5224b92ee-product.webp")
          .headers(headers_3),
        http("request_104")
          .get(uri37 + "/p/3ca4c54408c2892b4e941bc75ae2c2d7-product.webp")
          .headers(headers_3),
        http("request_105")
          .get(uri37 + "/p/3c0a8d2bc5d46bbcd180c08b8237a243-product.webp")
          .headers(headers_3),
        http("request_106")
          .get(uri37 + "/p/c0cd3d1d857e2443d3c47d9c0539205a-product.webp")
          .headers(headers_3),
        http("request_107")
          .get(uri37 + "/cms/512b8d6a-55e4-11eb-bf1f-e673225b7336.webp")
          .headers(headers_3),
        http("request_108")
          .get(uri37 + "/p/ede4bf5b3b31286df5807c9c8bb738ee-product.webp")
          .headers(headers_3),
        http("request_109")
          .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1cdc552d5c8be__popup_imp.png")
            .headers(headers_3),
            http("request_110")
              .get(uri03 + "/42fa44bc-c9bc-11e9-a351-52dc582f5ff5.png")
              .headers(headers_110),
            http("request_111")
              .get(uri03 + "/0d16929e-c9bf-11e9-a45a-52dc582f5ff5.png")
              .headers(headers_110),
            http("request_112")
              .get(uri03 + "/482519c2-eb06-11eb-81fc-c6d6a10dff4c.png")
              .headers(headers_110),
            http("request_113")
              .get(uri37 + "/p/3cf0373144c064fa72ca0c286283b7b4-product.webp")
              .headers(headers_3),
            http("request_114")
              .get(uri37 + "/cms/1f215c6e-8489-11ea-9caa-ca3fed3fd0ef.webp")
              .headers(headers_3),
            http("request_115")
              .get(uri37 + "/p/ae0810033b6fd5cc0455f8cd6fb4577a-product.webp")
              .headers(headers_3),
            http("request_116")
              .get(uri37 + "/p/e3cb4db953b52db97edb81635c827afe-product.webp")
              .headers(headers_3),
            http("request_117")
              .get(uri37 + "/cms/330c3294-8489-11ea-8526-1ea4d6a3f68d.webp")
              .headers(headers_3),
            http("request_118")
              .get(uri16 + "/tr/?id=543671342917527&ev=PageView&dl=https%3A%2F%2Fwww.linio.cl%2F&rl=&if=false&ts=1630209072618&sw=1366&sh=700&v=2.9.45&r=stable&a=seg&ec=0&o=30&fbp=fb.1.1630209072616.1834103300&it=1630209071760&coo=false&dpo=LDU&dpoco=0&dpost=0&exp=p1&rqm=GET")
              .headers(headers_3),
            http("request_119")
              .get(uri37 + "/p/ccdb23ffc679f0b64b13246092a42a78-product.webp")
              .headers(headers_3),
            http("request_120")
              .get(uri23 + "/imp?cnst=1&msn=webserve-7d22c79.use&id=-3030922298482031569&sec=8767679&imps%5B0%5D=dy_unit%7Csmart_object_1135805%7C%7C256%7C%7C%7C&imps%5B1%5D=dy_unit%7Csmart_object_830067%7C%7C256%7C%7C%7C&imps%5B2%5D=dy_unit%7Csmart_object_833083%7C%7C256%7C%7C%7C&imps%5B3%5D=dy_unit%7Csmart_object_1135814%7C%7C256%7C%7C%7C&imps%5B4%5D=dy_unit%7Csmart_object_1126119_26282918%7C%7C597%7C%7C%7C&imps%5B5%5D=dy_unit%7Csmart_object_1126119_26282921%7C%7C597%7C%7C%7C&imps%5B6%5D=dy_unit%7Csmart_object_1126119_26282923%7C%7C597%7C%7C%7C&imps%5B7%5D=dy_unit%7Csmart_object_1126119_26282926%7C%7C597%7C%7C%7C&imps%5B8%5D=dy_unit%7Csmart_object_1126119_26282919%7C%7C597%7C%7C%7C&imps%5B9%5D=dy_unit%7Csmart_object_1126119_26282924%7C%7C597%7C%7C%7C&imps%5B10%5D=dy_unit%7Csmart_object_1041322%7C%7C744%7C%7C%7C&imps%5B11%5D=dy_unit%7Csmart_object_1135934%7C%7C1489%7C%7C%7C&imps%5B12%5D=dy_unit%7Csmart_object_1135941%7C%7C1489%7C%7C%7C&imps%5B13%5D=dy_unit%7Csmart_object_1135943%7C%7C1489%7C%7C%7C&imps%5B14%5D=dy_unit%7Csmart_object_1133535%7C%7C3483%7C%7C%7C&imps%5B15%5D=dy_unit%7Csmart_object_1097529%7C%7C246%7C%7C%7C&cl=dk.w.c.ms.&bl=0&l=def&p=1&sd=&rf=&trf=0&sr=1366x700&ses=527763133d467336e8964dde46a59047&aud=1474935.401657.401659.680587&svars=1359%3A%40%3Afalse.%40.1360%3A%40%3Afalse.%40.1423%3A%40%3Afalse&url=https%3A%2F%2Fwww.linio.cl%2F&exps=%5B%5B%22224534%22%2C%228989788%22%2C%226772166%22%2C0%2Cnull%2Cnull%2C%223913585303591300795%22%2C%222%22%2C%223%22%5D%2C%5B%22368089%22%2C%223949560%22%2C%2210596091%22%2C0%2Cnull%2Cnull%2C%223913585306572009774%22%2C%221%22%2Cnull%5D%2C%5B%22339530%22%2C%223704074%22%2C%229870482%22%2C0%2Cnull%2Cnull%2C%223913585305388467307%22%2C%221%22%2Cnull%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282918%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282921%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282923%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282926%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282919%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282924%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%5D&expSes=7888&reqts=1630209072043&rri=3333728&_=1630209073044")
              .headers(headers_22),
            http("request_121")
              .get(uri37 + "/p/a5ee5793d375876dacc61acc8de56cda-product.webp")
              .headers(headers_3),
            http("request_122")
              .get(uri37 + "/cms/4e64e2d6-4a02-11eb-a900-e2a98cf53925.webp")
              .headers(headers_3),
            http("request_123")
              .get(uri37 + "/p/3f6b447c68d30e0e1b7e8caa7bd49cf4-product.webp")
              .headers(headers_3),
            http("request_124")
              .get(uri37 + "/cms/354b9752-8489-11ea-b3d5-ca3fed3fd0ef.webp")
              .headers(headers_3),
            http("request_125")
              .get(uri37 + "/p/913b7e6dc04b920055d5e914bb370a34-product.webp")
              .headers(headers_3),
            http("request_126")
              .get(uri37 + "/p/80313892d99f3c658bec1b1b504b2a92-product.webp")
              .headers(headers_3),
            http("request_127")
              .get(uri23 + "/var?cnst=1&_=795037&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=1&ve=10405946&va=%5B%7B%22id%22%3A26282919%2C%22idx%22%3A4%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209072253&rri=8418430")
              .headers(headers_22),
            http("request_128")
              .get(uri23 + "/var?cnst=1&_=223707&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=1&ve=10405946&va=%5B%7B%22id%22%3A26282924%2C%22idx%22%3A5%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=1&tsrc=Direct&reqts=1630209072252&rri=79762")
              .headers(headers_22),
            http("request_129")
              .get(uri23 + "/var?cnst=1&_=543175&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=1&ve=10405946&va=%5B%7B%22id%22%3A26282926%2C%22idx%22%3A3%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209072254&rri=5742915")
              .headers(headers_22),
            http("request_130")
              .get(uri23 + "/var?cnst=1&_=929902&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=1&ve=10405946&va=%5B%7B%22id%22%3A26282923%2C%22idx%22%3A2%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209072254&rri=8839868")
              .headers(headers_22),
            http("request_131")
              .get(uri23 + "/var?cnst=1&_=685394&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=1&ve=10405946&va=%5B%7B%22id%22%3A26282921%2C%22idx%22%3A1%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209072255&rri=1153417")
              .headers(headers_22),
            http("request_132")
              .get(uri23 + "/var?cnst=1&_=713223&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=1&ve=10405946&va=%5B%7B%22id%22%3A26282918%2C%22idx%22%3A0%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209072256&rri=5749245")
              .headers(headers_22),
            http("request_133")
              .get(uri37 + "/cms/5d45b5de-4a05-11eb-ab10-e673225b7336.webp")
              .headers(headers_3),
            http("request_134")
              .get(uri37 + "/cms/8cfb4db2-f486-11eb-acbe-168c0a9d1b5d.webp")
              .headers(headers_3),
            http("request_135")
              .get(uri37 + "/p/4eeb206c8617402eedbec21782482333-product.webp")
              .headers(headers_3),
            http("request_136")
              .get(uri37 + "/p/f19f6a7d0d402fdbcb5bf4f9a99b312b-product.webp")
              .headers(headers_3),
            http("request_137")
              .get(uri37 + "/p/066d0a5f5c2deafe83e85fca502ed2ba-product.webp")
              .headers(headers_3),
            http("request_138")
              .get(uri37 + "/cms/eb2201e2-503a-11eb-9571-e673225b7336.webp")
              .headers(headers_3),
            http("request_140")
              .get(uri37 + "/p/9cc4b07a7816f8444c13498b19987e82-product.webp")
              .headers(headers_3),
            http("request_141")
              .get(uri37 + "/cms/79bdf42c-55a6-11eb-9816-e673225b7336.webp")
              .headers(headers_3),
            http("request_142")
              .get(uri37 + "/p/54b19e86d2d727d8913360770080dcd8-product.webp")
              .headers(headers_3),
            http("request_143")
              .get(uri37 + "/p/e8d80934daf5b38058d1a01c17b8fdb8-product.webp")
              .headers(headers_3),
            http("request_144")
              .get(uri37 + "/p/c21213bc4422166be5a70650926eb552-product.webp")
              .headers(headers_3),
            http("request_145")
              .get(uri37 + "/cms/1c13e99e-55a6-11eb-ba7d-e2a98cf53925.webp")
              .headers(headers_3),
            http("request_146")
              .get(uri06 + "/api/v1/sync/a7f32eea-2f96-4ca2-a1fd-2184199629d3/web?callback=__jp0")
              .headers(headers_1),
            http("request_147")
              .get(uri37 + "/p/8d2b569a322fa84f1a7c7237be36c4a3-product.webp")
              .headers(headers_3),
            http("request_148")
              .get(uri37 + "/p/e0cd7a5e04ad8cb71d88e6f7dd6520c6-product.webp")
              .headers(headers_3),
            http("request_149")
              .get(uri37 + "/p/520984bf7b3ac274d4f8c0fe554a0917-product.webp")
              .headers(headers_3),
            http("request_150")
              .get(uri37 + "/cms/886ca0ce-ee1a-11eb-aeef-1a0d3920135d.webp")
              .headers(headers_3),
            http("request_151")
              .get(uri37 + "/p/c9b3551c86eb81b3e7e006f8efcd0064-product.webp")
              .headers(headers_3),
            http("request_152")
              .get(uri37 + "/p/72251501b6b1e1189beb000f4feecc68-product.webp")
              .headers(headers_3),
            http("request_153")
              .get(uri23 + "/var?cnst=1&_=984230&msn=webserve-7d22c79.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1110783&p=1&ve=10179139&va=%5B26134582%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585303080550869&mech=1&smech=null&eri=1&tsrc=Direct&reqts=1630209072751&rri=4276864")
              .headers(headers_22),
            http("request_154")
              .get(uri37 + "/p/b6bf055df5c49ff9b06d5909e69eae5b-product.webp")
              .headers(headers_3),
            http("request_155")
              .get(uri37 + "/cms/4f7f62c2-ee1c-11eb-a0a1-c6d6a10dff4c.webp")
              .headers(headers_3),
            http("request_156")
              .get(uri37 + "/p/087b1718f1a77ea7350df879500657ce-product.webp")
              .headers(headers_3),
            http("request_157")
              .get(uri37 + "/p/d056d2c89cfad99616886dfda391aa2a-product.webp")
              .headers(headers_3),
            http("request_158")
              .get(uri37 + "/cms/35af18de-5aaf-11eb-9c4c-e2a98cf53925.webp")
              .headers(headers_3),
            http("request_159")
              .get(uri37 + "/p/7ebbc85c5f7fa0a67e2b09ebfe0629f2-product.webp")
              .headers(headers_3),
            http("request_160")
              .get(uri37 + "/p/584ace4036c43afd233cfd9a1247004b-product.webp")
              .headers(headers_3),
            http("request_161")
              .get(uri37 + "/p/8806a42de53c94eb119d896bef294c5e-product.webp")
              .headers(headers_3),
            http("request_162")
              .get(uri37 + "/p/a6560fae81766b1dce4228e6496070e1-product.webp")
              .headers(headers_3),
            http("request_163")
              .get(uri37 + "/cms/0dd9be30-d5da-11eb-834f-96a0bacba68a.webp")
              .headers(headers_3),
            http("request_164")
              .get(uri37 + "/p/2f7e422bb7ffc4c9429b625683882aa3-product.webp")
              .headers(headers_3),
            http("request_165")
              .get(uri37 + "/cms/7a518a78-8489-11ea-979c-ca3fed3fd0ef.webp")
              .headers(headers_3),
            http("request_166")
              .get(uri37 + "/p/fa610780faf78f7a08baf6de147d0f16-product.webp")
              .headers(headers_3),
            http("request_167")
              .get(uri37 + "/p/efdd258d79d8ba0f27161d9417a64e55-product.webp")
              .headers(headers_3),
            http("request_168")
              .get(uri37 + "/cms/12912064-60cb-11eb-a49e-e673225b7336.webp")
              .headers(headers_3),
            http("request_169")
              .get(uri37 + "/p/4160f258cdd6965d5043a451aa28a95d-product.webp")
              .headers(headers_3),
            http("request_170")
              .get(uri37 + "/p/d15bf211b0762668ad1c4742fc9a2d12-card.webp")
              .headers(headers_3),
            http("request_171")
              .get(uri37 + "/p/101a9bd4cc54fffdf248e1827f05efb6-card.webp")
              .headers(headers_3),
            http("request_172")
              .get(uri37 + "/p/e9c62f25ddb3ec50b317f32ea86336e1-card.webp")
              .headers(headers_3),
            http("request_173")
              .get(uri37 + "/p/e33b8424659781afcc72dec4635aeb89-card.webp")
              .headers(headers_3),
            http("request_174")
              .get(uri37 + "/p/0d1d451509bc622477eacf811dd4c963-card.webp")
              .headers(headers_3),
            http("request_175")
              .get(uri37 + "/p/df5b6322c6e8a0c3bcbd416ad3dfc1d3-card.webp")
              .headers(headers_3),
            http("request_176")
              .get(uri37 + "/p/0546b80dc0703589adabdaf551acad68-card.webp")
              .headers(headers_3),
            http("request_177")
              .get(uri37 + "/p/672eb306983c91eb3b3e402cf4daceb0-card.webp")
              .headers(headers_3),
            http("request_178")
              .get(uri37 + "/p/4b84aa7a8bb6230963fc057a1f54af5b-card.webp")
              .headers(headers_3),
            http("request_179")
              .get(uri37 + "/p/48904f6c735b4a52d8d29dbaa1fcb6e5-card.webp")
              .headers(headers_3),
            http("request_180")
              .get(uri37 + "/p/66d3047f6acbc5a1045d3e3ff3679498-card.webp")
              .headers(headers_3),
            http("request_181")
              .get(uri37 + "/p/8b86fd85bd9b7c0b2bc20107f6090836-card.webp")
              .headers(headers_3),
            http("request_182")
              .get(uri37 + "/p/8979c6277acbccdad3c1f0d54d7981cf-card.webp")
              .headers(headers_3),
            http("request_183")
              .get(uri37 + "/p/296928ac8b07f282c955563acf21487b-card.webp")
              .headers(headers_3),
            http("request_184")
              .get(uri37 + "/p/5ac714a9e7c3af72cbca7f60a5311f71-card.webp")
              .headers(headers_3),
            http("request_185")
              .get(uri37 + "/p/27f738d915547509ffd5e329dfad4081-card.webp")
              .headers(headers_3),
            http("request_186")
              .get(uri37 + "/p/6b82d3178c4d688692debafc7691ad96-card.webp")
              .headers(headers_3),
            http("request_187")
              .get(uri37 + "/p/10059aaf4fa3d6a98f4a88e79d29c447-card.webp")
              .headers(headers_3),
            http("request_188")
              .get(uri37 + "/p/e10e8c290c1962b55d2aa97d4b0219a8-card.webp")
              .headers(headers_3),
            http("request_189")
              .get(uri37 + "/p/538eb50c75b20361e577fa89db982253-card.webp")
              .headers(headers_3),
            http("request_190")
              .get(uri37 + "/p/1803ef5bf015a9bd4dc827816005034f-card.webp")
              .headers(headers_3),
            http("request_191")
              .get(uri37 + "/p/6865b748205b107b445edbcc0e4c01de-card.webp")
              .headers(headers_3),
            http("request_192")
              .get(uri37 + "/p/1291350fe5f648d02af986e2af8b0004-card.webp")
              .headers(headers_3),
            http("request_193")
              .get(uri37 + "/p/691c676c0528bf25388bb3d41bc62bf7-card.webp")
              .headers(headers_3),
            http("request_194")
              .get(uri37 + "/p/9e93ccc63db1f294329a47accfdd0198-card.webp")
              .headers(headers_3),
            http("request_195")
              .get(uri37 + "/p/2d0cc54d4526e749a0a541585f6b4ccf-card.webp")
              .headers(headers_3),
            http("request_196")
              .get(uri37 + "/p/81a80a875773108720445306a65a83ec-card.webp")
              .headers(headers_3),
            http("request_197")
              .get(uri37 + "/p/0c78b816e4f3e3c924f7c5cec20a3dc2-card.webp")
              .headers(headers_3),
            http("request_198")
              .get(uri37 + "/p/6694ad7dbc88cef71999280b83ed6b15-card.webp")
              .headers(headers_3),
            http("request_199")
              .get(uri37 + "/p/3b6b6b2e86033ebd76efe2e5a7ff5150-card.webp")
              .headers(headers_3),
            http("request_200")
              .get(uri37 + "/p/ef2991edc2adba55c52b4cf351aba7f7-card.webp")
              .headers(headers_3),
            http("request_201")
              .get(uri37 + "/p/d21657e219c6369e47c1b35bbc097dcd-card.webp")
              .headers(headers_3),
            http("request_202")
              .get(uri37 + "/p/c0cd3d1d857e2443d3c47d9c0539205a-card.webp")
              .headers(headers_3),
            http("request_203")
              .get(uri37 + "/p/3e4a77a0f95e73bf9a072fbff537e0cc-card.webp")
              .headers(headers_3),
            http("request_204")
              .get(uri37 + "/p/bf644e756b61f233cb2c3394f24480c0-card.webp")
              .headers(headers_3),
            http("request_205")
              .get(uri37 + "/p/475ca316084c800e33be57d0889949ef-card.webp")
              .headers(headers_3),
            http("request_206")
              .get(uri37 + "/p/ac6b7cea073ccbab89f58688f5f9743a-card.webp")
              .headers(headers_3),
            http("request_207")
              .get(uri37 + "/p/a080227aad425dbd143818fffbe39f74-card.webp")
              .headers(headers_3),
            http("request_208")
              .get(uri37 + "/p/09b98e57f9a0bb6f5a1691c69fd43f59-card.webp")
              .headers(headers_3),
            http("request_209")
              .get(uri37 + "/p/f03a7278ea669d1e50b3f796b8e8e694-card.webp")
              .headers(headers_3),
            http("request_210")
              .get(uri37 + "/p/d4ff86507709f3cbda48f5db0f09bb27-card.webp")
              .headers(headers_3),
            http("request_211")
              .get(uri37 + "/p/d0eab973742a6324ebc99df8a7b1067a-card.webp")
              .headers(headers_3),
            http("request_212")
              .get(uri37 + "/p/0b7f040d8de6d8da4fe2681e0518e9e5-card.webp")
              .headers(headers_3),
            http("request_213")
              .get(uri37 + "/p/ae0810033b6fd5cc0455f8cd6fb4577a-card.webp")
              .headers(headers_3),
            http("request_214")
              .get(uri37 + "/p/fb10bcb7bff584081239169beff6151c-card.webp")
              .headers(headers_3),
            http("request_215")
              .get(uri37 + "/p/f9a4d32585beb3678dd9cf75bf0a5320-card.webp")
              .headers(headers_3),
            http("request_216")
              .get(uri37 + "/p/1eededaef55cfc5f9d012ad17a6c7d48-card.webp")
              .headers(headers_3),
            http("request_217")
              .get(uri37 + "/p/d4c88b43c1a9f1ae8cc04cfea8c04ed9-card.webp")
              .headers(headers_3),
            http("request_218")
              .get(uri37 + "/p/ea79f3aca1d598fdad4c52b3285640dd-card.webp")
              .headers(headers_3),
            http("request_219")
              .get(uri37 + "/p/68ac2d4717c9e389083da27cfc5f57f8-card.webp")
              .headers(headers_3),
            http("request_220")
              .get(uri37 + "/p/973d7154d5701e1bfe7e132fe76b4152-card.webp")
              .headers(headers_3),
            http("request_221")
              .get(uri37 + "/p/a7ede4cd8cdcc99566db21bad29e445d-card.webp")
              .headers(headers_3),
            http("request_222")
              .get(uri37 + "/p/bac3e2cc3677bdedce8aa8950e2d3a9f-card.webp")
              .headers(headers_3),
            http("request_223")
              .get(uri37 + "/p/40d64219cc56d7cdc1f5e7aa70deee39-card.webp")
              .headers(headers_3),
            http("request_224")
              .get(uri37 + "/p/0c462e1122458ffcb361de9a44997aa8-card.webp")
              .headers(headers_3),
            http("request_225")
              .get(uri37 + "/p/e6d914b5b64786e27851e76a4e92f1dc-card.webp")
              .headers(headers_3),
            http("request_226")
              .get(uri37 + "/p/31a3e9eaea3c9838bad4f9fb409ba15a-card.webp")
              .headers(headers_3),
            http("request_227")
              .get(uri37 + "/p/bc4c8e71e0000eb1d43a014bf3d23855-card.webp")
              .headers(headers_3),
            http("request_228")
              .get(uri37 + "/p/0b88b3b0f0b1a39284515f36dfca8a1c-card.webp")
              .headers(headers_3),
            http("request_229")
              .get(uri37 + "/p/4441687924dd4607d13be48290e11e3e-card.webp")
              .headers(headers_3),
            http("request_230")
              .get(uri37 + "/p/16fc9cb9f8f9fac3576e8761b30cf331-card.webp")
              .headers(headers_3),
            http("request_231")
              .get(uri37 + "/p/974b5adcaaca4ef436dfb7209e3bd39e-card.webp")
              .headers(headers_3),
            http("request_232")
              .get(uri37 + "/p/94bda0a8b4c6d88a5b9203e3934db21b-card.webp")
              .headers(headers_3),
            http("request_233")
              .get(uri37 + "/p/535579cc9f6bcb1500699fe7b9f184ac-card.webp")
              .headers(headers_3),
            http("request_234")
              .get(uri37 + "/p/cbd271f3d68cad9c61c4f5359765a09d-card.webp")
              .headers(headers_3),
            http("request_235")
              .get(uri37 + "/p/8e69ee33514b3be763db02ad7f4676f8-card.webp")
              .headers(headers_3),
            http("request_236")
              .get(uri37 + "/p/8d82a6ab3ca03303aa74f872df07bd75-card.webp")
              .headers(headers_3),
            http("request_237")
              .get(uri37 + "/p/2de4a29358d24dd19c8dc5baf7bfce0a-card.webp")
              .headers(headers_3),
            http("request_238")
              .get(uri37 + "/p/eca31b10272009c4e83e2d2149be711d-card.webp")
              .headers(headers_3),
            http("request_239")
              .get(uri37 + "/p/43dd3abbe26cb0cf811bf898c491f588-card.webp")
              .headers(headers_3),
            http("request_240")
              .get(uri37 + "/p/c12cdb2313b34636589d065a7e78042e-card.webp")
              .headers(headers_3),
            http("request_241")
              .get(uri37 + "/p/d2b704c5fe7620e89dfd887a805cf8e7-card.webp")
              .headers(headers_3),
            http("request_242")
              .get(uri37 + "/p/6aaebc56b73569589d0bb107533c2d8c-card.webp")
              .headers(headers_3),
            http("request_243")
              .get(uri37 + "/p/50a925971913fe8e75d758a7ac756344-card.webp")
              .headers(headers_3),
            http("request_244")
              .get(uri37 + "/p/1ce542e612c805006dbf1a7509101cd2-card.webp")
              .headers(headers_3),
            http("request_245")
              .get(uri37 + "/p/93b92db0d29c3ac19bf89d1ac6e4b210-card.webp")
              .headers(headers_3),
            http("request_246")
              .get(uri37 + "/p/a763e5c1aa2f02dd3b3c7ecfe61da4e5-card.webp")
              .headers(headers_3),
            http("request_247")
              .post("/collect")
              .headers(headers_247)
              .body(RawFileBody("recordedsimulation/0247_request.txt")),
            http("request_248")
              .get(uri37 + "/p/c14f17f9629d1a6efc0841f168a7603d-card.webp")
              .headers(headers_3),
            http("request_249")
              .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&cu=CLP&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=Ecommerce&ea=Impressions&el=&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209078490.bjzkelnm&promo1id=https%3A%2F%2Fdynamic-yield.linio.com%2F%2Fapi%2Fscripts%2F8767679%2Fimages%2F2fa941943b5b0__5adbbc1e-043e-11ec-989a-860be6527422.jpg%20%3A%3A%20https%3A%2F%2Fwww.linio.cl%2Fc%2Fcelulares-y-tablets%2Fcelulares-y-smartphones%3Fskus%3DAP054EL0275VVLACL%2CSA028EL126W4BLACL%2CAP054EL0J1Y1KLACL%2CSA028EL15M7D4LACL%2CXI416EL0DSEJILACL%2CAS049EL0ZFXKELACL%2CAP054EL0SCAVZLACL%2CSA028EL0K3ZZ4LACL&promo1nm=Celulares&promo1ps=7%2F80&promo1cr=%2F%20%3A%3A%20home%20%3A%3A%20Celulares&z=1814845525")
              .headers(headers_3)))
      .pause(2).exitHereIfFailed
      .exec(http("request_251")
        .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=1&cu=CLP&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=Ecommerce&ea=Impressions&el=&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209084440.30cxiqcb&promo1id=https%3A%2F%2Fdynamic-yield.linio.com%2F%2Fapi%2Fscripts%2F8767679%2Fimages%2F361d9c967cae2__onbb_welcome_nuevosusuarios_cl.jpg%20%3A%3A%20https%3A%2F%2Fwww.linio.cl%2Fcm%2Ftodo-a-menos&promo1nm=Todo%20a%20menos&promo1ps=8%2F80&promo1cr=%2F%20%3A%3A%20home%20%3A%3A%20Todo%20a%20menos&z=533049671")
        .headers(headers_3))
      .pause(1)
      .exec(http("request_252")
        .get("/collect?v=1&_v=j93&a=1394465719&t=event&ni=0&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=ui%20%3A%3A%20main_header%20%3A%3A%20user_menu&ea=click&el=my%20account%20%3A%3A%20Iniciar%20sesi%C3%B3n%20%3A%3A%20https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ev=1&xid=0&xvar=0&_u=aGDACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209086259.38pzq1r&z=1255328321")
        .headers(headers_3)
        .resources(http("request_253")
          .get(uri10 + "/account/login")
          .headers(headers_253),
          http("request_254")
            .get(uri09 + "/js/core-dfb5bbecaa.js")
            .headers(headers_14),
          http("request_256")
            .get(uri28 + "?")
            .headers(headers_9),
          http("request_257")
            .get(uri38 + "/js/api:client.js?onload=googleAsyncInit")
            .headers(headers_1),
          http("request_258")
            .get(uri09 + "/css/alice-8953651e57.css")
            .headers(headers_2),
          http("request_259")
            .get(uri09 + "/js/auth-15668ccf28.js")
            .headers(headers_1),
          http("request_260")
            .get(uri09 + "/assets/fonts/iconfont-linio-2f22b19d6b.woff2")
            .headers(headers_260),
          http("request_261")
            .get(uri09 + "/js/shopping-023e31f84f.js")
            .headers(headers_1),
          http("request_262")
            .get(uri09 + "/assets/images/logos/linio-by-fb-gray-b90f0f5ecc.svg")
            .headers(headers_3),
          http("request_264")
            .get(uri38 + "/_/scs/apps-static/_/js/k=oz.gapi.en_US.UYHeVG_mX5s.O/m=client/rt=j/sv=1/d=1/ed=1/am=AQ/rs=AGLTcCPDcESMLF74mIvk5CKxuCjzYIf5XA/cb=gapi.loaded_0")
            .headers(headers_1),
          http("request_266")
            .get(uri09 + "/css/alice-53b710c6df.lazy.css")
            .headers(headers_14),
          http("request_267")
            .get(uri36)
            .headers(headers_14)
            .check(status.is(210)),
          http("request_269")
            .get(uri16 + "/x/oauth/status?client_id=1395123160710004&input_token&origin=1&redirect_uri=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&sdk=joey&wants_cookie_data=false")
            .headers(headers_22),
          http("request_270")
            .get(uri35 + "/api_static.js")
            .headers(headers_14),
          http("request_271")
            .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
            .headers(headers_14),
          http("request_272")
            .get(uri35 + "/api_dynamic.js")
            .headers(headers_14),
          http("request_273")
            .get(uri09 + "/images/favicon-by-fb-1f05deec69.png")
            .headers(headers_14),
          http("request_274")
            .get(uri09 + "/assets/sprites/alice-2330db5b1f-87b340fa20.png")
            .headers(headers_14),
          http("request_275")
            .get("/analytics.js")
            .headers(headers_14),
          http("request_276")
            .get(uri24)
            .headers(headers_14),
          http("request_278")
            .get(uri33 + "/tm/?t=linio.cl")
            .headers(headers_14),
          http("request_279")
            .get(uri17 + "?tag=linio-cl-general")
            .headers(headers_14),
          http("request_280")
            .get(uri20)
            .headers(headers_14),
          http("request_281")
            .get(uri40 + "/OneSignalSDK.js")
            .headers(headers_14),
          http("request_282")
            .get("/plugins/ua/ec.js")
            .headers(headers_14),
          http("request_283")
            .get(uri41 + "/scripts/0013/6709.js")
            .headers(headers_1),
          http("request_284")
            .get(uri40 + "/OneSignalPageSDKES6.js?v=151507")
            .headers(headers_14),
          http("request_285")
            .get(uri08)
            .headers(headers_1),
          http("request_286")
            .get("/gtm/js?id=OPT-NNG2275&t=gtm13&cid=1624135901.1630209072&gac=_gaexp%3DGAX1.2.edOKrHSKRpG_QJZ8lfKlYA.18950.1")
            .headers(headers_1),
          http("request_287")
            .get(uri25 + "/1004172317/?random=1630209088749&cv=9&fst=1630209088749&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
            .headers(headers_1),
          http("request_288")
            .get(uri25 + "/969755919/?random=1630209088758&cv=9&fst=1630209088758&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&resp=GooglemKTybQhCsO&eid=376635470&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ref=https%3A%2F%2Fwww.linio.cl%2F&tiba=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
            .headers(headers_1),
          http("request_291")
            .get(uri41 + "/data-scripts/0013/6709.json?t=1")
            .headers(headers_22),
          http("request_292")
            .get(uri06 + "/api/v1/sync/a7f32eea-2f96-4ca2-a1fd-2184199629d3/web?callback=__jp0")
            .headers(headers_14),
          http("request_293")
            .get(uri22 + "?sec=8767679&inHead=true&id=-3030922298482031569&jsession=fq1hr8p9ighrpxejez6cgudsyv4buylg&ref=https%3A%2F%2Fwww.linio.cl%2F&scriptVersion=1.28.3&dyid_server=")
            .headers(headers_1),
          http("request_294")
            .get(uri41 + "/versioned/common-scripts/11.1.331.js")
            .headers(headers_14),
          http("request_301")
            .get(uri07)
            .headers(headers_14),
          http("request_302")
            .get("/collect?v=1&_v=j93&a=376354975&t=pageview&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ul=en-in&de=UTF-8&dt=Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile&sd=24-bit&sr=1366x700&vp=1350x700&je=0&exp=edOKrHSKRpG_QJZ8lfKlYA.1&_u=SCCAgEILQ~&jid=&gjid=&cid=1624135901.1630209072&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209088998.ow0slhae&z=1552382902")
            .headers(headers_3),
          http("request_303")
            .get(uri33 + "/lse1.0.html")
            .headers(headers_37),
          http("request_304")
            .get(uri16 + "/tr/?id=543671342917527&ev=PageView&dl=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&rl=https%3A%2F%2Fwww.linio.cl%2F&if=false&ts=1630209089111&sw=1366&sh=700&v=2.9.45&r=stable&a=seg&ec=0&o=30&fbp=fb.1.1630209072616.1834103300&it=1630209088963&coo=false&dpo=LDU&dpoco=0&dpost=0&rqm=GET")
            .headers(headers_3),
          http("request_305")
            .get(uri41 + "/sampling-data-scripts/0013/6709.json?t=452835")
            .headers(headers_22),
          http("request_306")
            .get(uri18 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd&p1=e%3Ddis&adce=1&tld=linio.cl&dtycbr=82564")
            .headers(headers_1),
          http("request_309")
            .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq&id=pr_Ep0NkTU4joacylgRKAPq_lid_CCG4MhPZfWoInE2KQEjt&su=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&sr=https%3A%2F%2Fwww.linio.cl%2F&ts=1630209088671&tc=1")
            .headers(headers_37),
          http("request_310")
            .post(uri13 + "/p")
            .headers(headers_42)
            .body(RawFileBody("recordedsimulation/0310_request.txt")),
          http("request_311")
            .get(uri16 + "/tr/?id=543671342917527&ev=Microdata&dl=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&rl=https%3A%2F%2Fwww.linio.cl%2F&if=false&ts=1630209089621&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile%22%2C%22meta%3Akeywords%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile%22%2C%22og%3Adescription%22%3A%22Compra%20en%20L%C3%ADnea%20%E2%9C%93%20Env%C3%ADo%20a%20todo%20Chile%20%E2%9E%A4%20La%20mejor%20y%20m%C3%A1s%20grande%20tienda%20online%22%2C%22og%3Atype%22%3A%22website%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fassets.linio.com%2Fimages%2Flinio_logo_og-dac13811c9.png%22%2C%22og%3Asite_name%22%3A%22Linio%20Chile%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%7B%22%40context%22%3A%22http%3A%2F%2Fschema.org%22%2C%22%40type%22%3A%22Organization%22%2C%22name%22%3A%22Linio%22%2C%22url%22%3A%22https%3A%2F%2Fwww.linio.cl%22%2C%22logo%22%3A%22https%3A%2F%2Fassets.linio.com%2Fimages%2Flinio_logo_og-dac13811c9.png%22%2C%22sameAs%22%3A%5B%22https%3A%2F%2Fwww.facebook.com%2FLinioChile%2F%22%2C%22https%3A%2F%2Ftwitter.com%2FLinioChile%2F%22%2C%22https%3A%2F%2Fwww.youtube.com%2Fchannel%2FUCv1mafivZIxAjF2-xGIr7zQ%2Ffeed%22%2C%22https%3A%2F%2Fes.wikipedia.org%2Fwiki%2FLinio.com%22%5D%2C%22potentialAction%22%3A%7B%22%40type%22%3A%22SearchAction%22%2C%22target%22%3A%22https%3A%2F%2Fwww.linio.cl%2Fsearch%3Fq%3D%7Bsearch_term_string%7D%22%2C%22query-input%22%3A%22required%20name%3Dsearch_term_string%22%7D%7D%5D&sw=1366&sh=700&v=2.9.45&r=stable&a=seg&ec=1&o=30&fbp=fb.1.1630209072616.1834103300&it=1630209088963&coo=false&dpo=LDU&dpoco=0&dpost=0&es=automatic&tm=3&rqm=GET")
            .headers(headers_3),
          http("request_312")
            .get(uri23 + "/var?cnst=1&_=425106&msn=webserve-ceb935f.use&uid=-3030922298482031569&sec=8767679&t=ri&e=368089&p=2&ve=3949560&va=%5B10596091%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.401657.401659.680587&expVisitId=3913585306572009774&mech=1&smech=null&eri=1&tsrc=Direct&reqts=1630209088248&rri=3217942")
            .headers(headers_22),
          http("request_313")
            .get(uri23 + "/dpx?cnst=1&_=650843&msn=webserve-ceb935f.use&name=Second%20Page%20View&props=%7B%7D&uid=-3030922298482031569&sec=8767679&cl=dk.w.c.ms.&ses=527763133d467336e8964dde46a59047&l=def&p=2&sd=&rf=internal&trf=0&aud=1474935.350117.401657.401659.680587&svars=1359%3A%40%3Afalse.%40.1360%3A%40%3Afalse.%40.1423%3A%40%3Afalse&url=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&exps=%5B%5B%22224534%22%2C%228989788%22%2C%226772166%22%2C0%2Cnull%2Cnull%2C%223913585303591300795%22%2C%222%22%2C%223%22%5D%2C%5B%22339530%22%2C%223704074%22%2C%229870482%22%2C0%2Cnull%2Cnull%2C%223913585305388467307%22%2C%221%22%2Cnull%5D%2C%5B%22368089%22%2C%223949560%22%2C%2210596091%22%2C0%2Cnull%2Cnull%2C%223913585306572009774%22%2C%221%22%2Cnull%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282918%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282921%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282923%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282926%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282919%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282924%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%5D&expSes=7888&tsrc=Direct&reqts=1630209088257&rri=9236613&geoData=IN_MH_Pune")
            .headers(headers_22),
          http("request_314")
            .post(uri23 + "/batch?cnst=1&_=1630209089260_281317")
            .headers(headers_91)
            .body(RawFileBody("recordedsimulation/0314_request.txt")),
          http("request_315")
            .get(uri23 + "/var?cnst=1&_=257797&msn=webserve-ceb935f.use&uid=-3030922298482031569&sec=8767679&t=ri&e=339530&p=2&ve=3704074&va=%5B9870482%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474935.350117.401657.401659.680587&expVisitId=3913585305388467307&mech=1&smech=null&eri=1&tsrc=Direct&reqts=1630209088264&rri=1253868")
            .headers(headers_22),
          http("request_316")
            .post(uri23 + "/uia?cnst=1&_=1630209089170")
            .headers(headers_22)
            .formParam("msn", "webserve-ceb935f.use")
            .formParam("id", "-3030922298482031569")
            .formParam("se", "8767679")
            .formParam("cl", "dk.w.c.ms.")
            .formParam("rf", "internal")
            .formParam("trf", "0")
            .formParam("p", "2")
            .formParam("sub", "www.linio.cl")
            .formParam("sd", "")
            .formParam("url", "https://www.linio.cl/account/login")
            .formParam("title", "Compra Online los mejores productos al mejor precio | Linio Chile")
            .formParam("lay", "def")
            .formParam("ses", "527763133d467336e8964dde46a59047")
            .formParam("aud", "1474935.401657.401659.680587")
            .formParam("svars", "1359:@:false.@.1360:@:false.@.1423:@:false")
            .formParam("gv", "")
            .formParam("exps", """[["224534","8989788","6772166",0,null,null,"3913585303591300795","2","3"],["339530","3704074","9870482",0,null,null,"3913585305388467307","1",null],["368089","3949560","10596091",0,null,null,"3913585306572009774","1",null],["1139502","10405946","26282918",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282921",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282923",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282926",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282919",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282924",0,null,null,"3913585303770245348","2","3"]]""")
            .formParam("lts", "9:21")
            .formParam("ctx", "")
            .formParam("lpInfo", "false")
            .formParam("expSes", "7888")
            .formParam("br", "Other")
            .formParam("tsrc", "Direct")
            .formParam("geoData", "IN_MH_Pune")
            .formParam("feedProps[categories]", "")
            .formParam("feedProps[keywords]", "")
            .formParam("cookieInfo", "0.0.988")
            .formParam("reqts", "1630209088158")
            .formParam("rri", "6567887")
            .formParam("nocks", "false"),
          http("request_317")
            .get(uri32 + "/extra-resources?ti=Ep0NkTU4joacylgRKAPq")
            .headers(headers_64),
          http("request_318")
            .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd&p1=e%3Ddis&adce=1&tld=linio.cl&dtycbr=82564")
            .headers(headers_1)))
      .pause(3)
      .exec(http("request_319")
        .get(uri09 + "/assets/images/svgIcons/input-ok-fe4e993cb4.svg")
        .headers(headers_3))
      .pause(4)
      .exec(http("request_321")
        .get(uri06 + "/sdks/OneSignalSDKStyles.css?v=2")
        .headers(headers_2)
        .resources(http("request_322")
          .get(uri06 + "/api/v1/apps/a7f32eea-2f96-4ca2-a1fd-2184199629d3/icon")
          .headers(headers_22),
          http("request_323")
            .get(uri19)
            .headers(headers_3)))
      .pause(1)
      .exec(http("request_324")
        .get(uri16 + "/tr/?id=543671342917527&ev=SubscribedButtonClick&dl=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&rl=https%3A%2F%2Fwww.linio.cl%2F&if=false&ts=1630209112365&cd[buttonFeatures]=%7B%22classList%22%3A%22align-right%20secondary%20slidedown-button%22%2C%22destination%22%3A%22%22%2C%22id%22%3A%22onesignal-slidedown-cancel-button%22%2C%22imageUrl%22%3A%22%22%2C%22innerText%22%3A%22Por%20ahora%20no%20%3A)%22%2C%22numChildButtons%22%3A0%2C%22tag%22%3A%22button%22%2C%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D&cd[buttonText]=Por%20ahora%20no%20%3A)&cd[formFeatures]=%5B%5D&cd[pageFeatures]=%7B%22title%22%3A%22Compra%20Online%20los%20mejores%20productos%20al%20mejor%20precio%20%7C%20Linio%20Chile%22%7D&cd[parameters]=%5B%5D&sw=1366&sh=700&udff[em]=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&udff[fn]=1968d882fe18702a3b231e566e69c60203d45bd6dd54d5969fe2ded3a0d06ff0&udff[ln]=0a55ff749359ef676107e876732a8015570182b44b11b1ceed7dbd0e37e05041&v=2.9.45&r=stable&a=seg&ec=2&o=2078&fbp=fb.1.1630209072616.1834103300&it=1630209088963&coo=false&dpo=LDU&dpoco=0&dpost=0&es=automatic&tm=3&rqm=GET")
        .headers(headers_3))
      .pause(6)
      .exec(http("request_325")
        .post(uri13 + "/m")
        .headers(headers_42)
        .body(RawFileBody("recordedsimulation/0325_request.txt")))
      .pause(9)
      .feed(csvFeeder)
      .exec(http("Registration")
        .post(uri10 + "/account/create").check(status.is(expected = 200))
        .headers(headers_327)
        .formParam("registration[email]", "${email}")
        .formParam("registration[firstName]", "${firstname}")
        .formParam("registration[lastName]", "${lastname}")
        .formParam("registration[password]", "${password}")
        .formParam("registration[nationalRegistrationNumber]", "13.645.742-k")
        .formParam("registration[subscribedToNewsletter]", "1")
        .formParam("registration[acceptTerms]", "1")
        .formParam("registration[_token]", "abd3647a890.6s-8MRaTozJISl0QNBeAEZtU_9agwPuMmlAwop0rOwc.o43KQCXy0lk9KBY9A1uzUqIHkrjEjs7h2GVf0ugTYm3YjYVrJcSQc34YZQ")
        .resources(http("request_328")
          .get(uri09 + "/assets/fonts/iconfont-linio-2f22b19d6b.woff2")
          .headers(headers_260),
          http("request_329")
            .get(uri09 + "/assets/images/logos/linio-by-fb-92fa2edd4c.svg")
            .headers(headers_14),
          http("request_331")
            .get(uri09 + "/css/alice-53b710c6df.lazy.css")
            .headers(headers_14),
          http("request_332")
            .get(uri37 + "/cms/7c0dfdee-0415-11ec-8c5e-860be6527422.webp")
            .headers(headers_14),
          http("request_333")
            .get(uri37 + "/cms/6ad645b0-05ee-11ec-9004-860be6527422.webp")
            .headers(headers_14),
          http("request_335")
            .get(uri36)
            .headers(headers_14)
            .check(status.is(210)),
          http("request_336")
            .get(uri35 + "/api_static.js")
            .headers(headers_14),
          http("request_337")
            .get(uri37 + "/cms/46df07f2-cf69-11eb-8dfe-ea9ed3d03cf3.webp")
            .headers(headers_14),
          http("request_338")
            .get(uri37 + "/p/ea79f3aca1d598fdad4c52b3285640dd-product.webp")
            .headers(headers_14),
          http("request_339")
            .get(uri37 + "/p/0d4245e5b447535da377b12de3413daf-product.webp")
            .headers(headers_14),
          http("request_340")
            .get(uri37 + "/cms/d768e81c-a938-11eb-986e-a22e373dfe30.webp")
            .headers(headers_14),
          http("request_341")
            .get(uri37 + "/cms/0febb2e2-ed3b-11ea-b3a7-4afca18a6672.webp")
            .headers(headers_14),
          http("request_342")
            .get(uri37 + "/p/3ca4c54408c2892b4e941bc75ae2c2d7-product.webp")
            .headers(headers_14),
          http("request_343")
            .get(uri37 + "/p/0d886d88e616512a59e520f5224b92ee-product.webp")
            .headers(headers_14),
          http("request_344")
            .get(uri37 + "/p/3c0a8d2bc5d46bbcd180c08b8237a243-product.webp")
            .headers(headers_14),
          http("request_345")
            .get(uri37 + "/p/c0cd3d1d857e2443d3c47d9c0539205a-product.webp")
            .headers(headers_14),
          http("request_346")
            .get(uri37 + "/cms/512b8d6a-55e4-11eb-bf1f-e673225b7336.webp")
            .headers(headers_14),
          http("request_347")
            .get(uri37 + "/p/ede4bf5b3b31286df5807c9c8bb738ee-product.webp")
            .headers(headers_14),
          http("request_348")
            .get(uri37 + "/p/3cf0373144c064fa72ca0c286283b7b4-product.webp")
            .headers(headers_14),
          http("request_349")
            .get(uri37 + "/cms/1f215c6e-8489-11ea-9caa-ca3fed3fd0ef.webp")
            .headers(headers_14),
          http("request_350")
            .get(uri37 + "/p/ae0810033b6fd5cc0455f8cd6fb4577a-product.webp")
            .headers(headers_14),
          http("request_351")
            .get(uri37 + "/p/e3cb4db953b52db97edb81635c827afe-product.webp")
            .headers(headers_14),
          http("request_352")
            .get(uri37 + "/cms/330c3294-8489-11ea-8526-1ea4d6a3f68d.webp")
            .headers(headers_14),
          http("request_353")
            .get(uri37 + "/p/ccdb23ffc679f0b64b13246092a42a78-product.webp")
            .headers(headers_14),
          http("request_354")
            .get(uri37 + "/p/a5ee5793d375876dacc61acc8de56cda-product.webp")
            .headers(headers_14),
          http("request_355")
            .get(uri37 + "/cms/4e64e2d6-4a02-11eb-a900-e2a98cf53925.webp")
            .headers(headers_14),
          http("request_356")
            .get(uri37 + "/p/3f6b447c68d30e0e1b7e8caa7bd49cf4-product.webp")
            .headers(headers_14),
          http("request_357")
            .get(uri37 + "/cms/354b9752-8489-11ea-b3d5-ca3fed3fd0ef.webp")
            .headers(headers_14),
          http("request_358")
            .get(uri37 + "/p/913b7e6dc04b920055d5e914bb370a34-product.webp")
            .headers(headers_14),
          http("request_359")
            .get(uri37 + "/p/80313892d99f3c658bec1b1b504b2a92-product.webp")
            .headers(headers_14),
          http("request_360")
            .get(uri37 + "/cms/5d45b5de-4a05-11eb-ab10-e673225b7336.webp")
            .headers(headers_14),
          http("request_361")
            .get(uri37 + "/cms/8cfb4db2-f486-11eb-acbe-168c0a9d1b5d.webp")
            .headers(headers_14),
          http("request_362")
            .get(uri37 + "/p/4eeb206c8617402eedbec21782482333-product.webp")
            .headers(headers_14),
          http("request_363")
            .get(uri37 + "/p/f19f6a7d0d402fdbcb5bf4f9a99b312b-product.webp")
            .headers(headers_14),
          http("request_364")
            .get(uri37 + "/p/066d0a5f5c2deafe83e85fca502ed2ba-product.webp")
            .headers(headers_14),
          http("request_365")
            .get(uri37 + "/cms/eb2201e2-503a-11eb-9571-e673225b7336.webp")
            .headers(headers_14),
          http("request_366")
            .get(uri37 + "/p/9cc4b07a7816f8444c13498b19987e82-product.webp")
            .headers(headers_14),
          http("request_367")
            .get(uri37 + "/cms/79bdf42c-55a6-11eb-9816-e673225b7336.webp")
            .headers(headers_14),
          http("request_368")
            .get(uri37 + "/p/54b19e86d2d727d8913360770080dcd8-product.webp")
            .headers(headers_14),
          http("request_369")
            .get(uri37 + "/p/c21213bc4422166be5a70650926eb552-product.webp")
            .headers(headers_14),
          http("request_370")
            .get(uri37 + "/p/e8d80934daf5b38058d1a01c17b8fdb8-product.webp")
            .headers(headers_14),
          http("request_371")
            .get(uri37 + "/cms/1c13e99e-55a6-11eb-ba7d-e2a98cf53925.webp")
            .headers(headers_14),
          http("request_372")
            .get(uri37 + "/p/8d2b569a322fa84f1a7c7237be36c4a3-product.webp")
            .headers(headers_14),
          http("request_373")
            .get(uri37 + "/p/e0cd7a5e04ad8cb71d88e6f7dd6520c6-product.webp")
            .headers(headers_14),
          http("request_374")
            .get(uri37 + "/p/520984bf7b3ac274d4f8c0fe554a0917-product.webp")
            .headers(headers_14),
          http("request_375")
            .get(uri37 + "/cms/886ca0ce-ee1a-11eb-aeef-1a0d3920135d.webp")
            .headers(headers_14),
          http("request_376")
            .get(uri37 + "/p/c9b3551c86eb81b3e7e006f8efcd0064-product.webp")
            .headers(headers_14),
          http("request_377")
            .get(uri37 + "/p/72251501b6b1e1189beb000f4feecc68-product.webp")
            .headers(headers_14),
          http("request_378")
            .get(uri37 + "/p/b6bf055df5c49ff9b06d5909e69eae5b-product.webp")
            .headers(headers_14),
          http("request_379")
            .get(uri37 + "/cms/4f7f62c2-ee1c-11eb-a0a1-c6d6a10dff4c.webp")
            .headers(headers_14),
          http("request_380")
            .get(uri37 + "/p/087b1718f1a77ea7350df879500657ce-product.webp")
            .headers(headers_14),
          http("request_381")
            .get(uri37 + "/p/d056d2c89cfad99616886dfda391aa2a-product.webp")
            .headers(headers_14),
          http("request_382")
            .get(uri37 + "/p/7ebbc85c5f7fa0a67e2b09ebfe0629f2-product.webp")
            .headers(headers_14),
          http("request_383")
            .get(uri37 + "/cms/35af18de-5aaf-11eb-9c4c-e2a98cf53925.webp")
            .headers(headers_14),
          http("request_384")
            .get(uri37 + "/p/584ace4036c43afd233cfd9a1247004b-product.webp")
            .headers(headers_14),
          http("request_385")
            .get(uri37 + "/p/8806a42de53c94eb119d896bef294c5e-product.webp")
            .headers(headers_14),
          http("request_386")
            .get(uri37 + "/p/a6560fae81766b1dce4228e6496070e1-product.webp")
            .headers(headers_14),
          http("request_387")
            .get(uri37 + "/cms/0dd9be30-d5da-11eb-834f-96a0bacba68a.webp")
            .headers(headers_14),
          http("request_388")
            .get(uri37 + "/p/2f7e422bb7ffc4c9429b625683882aa3-product.webp")
            .headers(headers_14),
          http("request_389")
            .get(uri37 + "/cms/7a518a78-8489-11ea-979c-ca3fed3fd0ef.webp")
            .headers(headers_14),
          http("request_390")
            .get(uri37 + "/p/fa610780faf78f7a08baf6de147d0f16-product.webp")
            .headers(headers_14),
          http("request_391")
            .get(uri37 + "/p/efdd258d79d8ba0f27161d9417a64e55-product.webp")
            .headers(headers_14),
          http("request_392")
            .get(uri37 + "/cms/12912064-60cb-11eb-a49e-e673225b7336.webp")
            .headers(headers_14),
          http("request_393")
            .get(uri37 + "/p/4160f258cdd6965d5043a451aa28a95d-product.webp")
            .headers(headers_14),
          http("request_394")
            .get(uri35 + "/api_dynamic.js")
            .headers(headers_14),
          http("request_395")
            .get(uri09 + "/assets/sprites/alice-2330db5b1f-87b340fa20.png")
            .headers(headers_14),
          http("request_396")
            .get(uri10 + "/api/order/stats")
            .headers(headers_28),
          http("request_397")
            .get("/analytics.js")
            .headers(headers_14),
          http("request_398")
            .get(uri24)
            .headers(headers_14),
          http("request_400")
            .get(uri33 + "/tm/?t=linio.cl")
            .headers(headers_14),
          http("request_402")
            .get(uri34)
            .headers(headers_14),
          http("request_403")
            .get(uri17 + "?tag=linio-cl-general")
            .headers(headers_14),
          http("request_404")
            .get(uri20)
            .headers(headers_14),
          http("request_405")
            .get(uri40 + "/OneSignalSDK.js")
            .headers(headers_14),
          http("request_406")
            .get("/plugins/ua/ec.js")
            .headers(headers_14),
          http("request_407")
            .get(uri41 + "/scripts/0013/6709.js")
            .headers(headers_1),
          http("request_408")
            .get("/gtm/js?id=OPT-NNG2275&t=gtm13&cid=1624135901.1630209072&gac=_gaexp%3DGAX1.2.edOKrHSKRpG_QJZ8lfKlYA.18950.1")
            .headers(headers_14),
          http("request_409")
            .get(uri08)
            .headers(headers_14),
          http("request_410")
            .get(uri05 + "?&t=1")
            .headers(headers_14),
          http("request_411")
            .get(uri22 + "?sec=8767679&inHead=true&id=-3030922298482031569&jsession=fq1hr8p9ighrpxejez6cgudsyv4buylg&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&scriptVersion=1.28.3&dyid_server=&ctx=%7B%22type%22%3A%22HOMEPAGE%22%7D")
            .headers(headers_1),
          http("request_413")
            .get(uri07)
            .headers(headers_14),
          http("request_414")
            .get(uri41 + "/data-scripts/0013/6709.json?t=1")
            .headers(headers_22),
          http("request_415")
            .get(uri25 + "/1004172317/?random=1630209144340&cv=9&fst=1630209144340&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&ig=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
            .headers(headers_1),
          http("request_416")
            .get(uri25 + "/969755919/?random=1630209144349&cv=9&fst=1630209144349&num=1&label=fbvdCIuDiV8Qj5q1zgM&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&gtm=2wg8p0&sendb=1&ig=1&data=ecomm_pagetype%3Dhome&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
            .headers(headers_1),
          http("request_417")
            .get(uri40 + "/OneSignalPageSDKES6.js?v=151507")
            .headers(headers_14),
          http("request_418")
            .get(uri41 + "/versioned/common-scripts/11.1.331.js")
            .headers(headers_14),
          http("request_422")
            .get(uri18 + "?a=69657&v=5.7.1&p0=e%3Dvh&p1=e%3Dexd%26ci%3Dd07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894%26site_type%3Dd&p2=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=38052")
            .headers(headers_1),
          http("request_424")
            .post("/j/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%202&el=Copy%20of%20H%7CB%7CV-2%7CG%7CNA%7CW35-Celulares%20(H%7CB%7CV-2%7CG%7CNA%7CW35-Celulares)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=1376675039&gjid=417806109&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&_r=1&gtm=2wg8p0PTM8PD&cd3=1630209144787.mapfhh6&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=1744877326")
            .headers(headers_42),
          http("request_425")
            .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq_home&id=pr_Ep0NkTU4joacylgRKAPq_lid_CCG4MhPZfWoInE2KQEjt&su=https%3A%2F%2Fwww.linio.cl%2F&sr=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ts=1630209144260")
            .headers(headers_37),
          http("request_427")
            .get(uri15 + "?id=mainad_comunicacoes_ltda&cok15=$CookieName$&cnty15=$GRegionCode$&ProgramName=Linio_CL&AudienceId=826&CampaignId=0&Referrer=https%3A%2F%2Fwww.linio.cl%2F&pagetype=home&Browsercheck=true&google_error=3")
            .headers(headers_37),
          http("request_428")
            .get(uri03 + "/42fa44bc-c9bc-11e9-a351-52dc582f5ff5.png")
            .headers(headers_14),
          http("request_429")
            .get(uri03 + "/0d16929e-c9bf-11e9-a45a-52dc582f5ff5.png")
            .headers(headers_14),
          http("request_430")
            .get(uri37 + "/p/fac00b2d2ce1b80b3a8c8f9407520e4f-product.webp")
            .headers(headers_14),
          http("request_434")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/361d9c967cae2__onbb_welcome_nuevosusuarios_cl.jpg")
            .headers(headers_14),
          http("request_435")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2e79c5a38cbf3__190x91_gadgets_1.jpg")
            .headers(headers_14),
          http("request_436")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/25a0ef8e41206__190x91_celulares_1.jpg")
            .headers(headers_14),
          http("request_437")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1f5c32beffc62__onbb_compras_nuevosusuarios_co.jpg")
            .headers(headers_14),
          http("request_438")
            .get(uri03 + "/482519c2-eb06-11eb-81fc-c6d6a10dff4c.png")
            .headers(headers_14),
          http("request_439")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2fa941943b5b0__5adbbc1e-043e-11ec-989a-860be6527422.jpg")
            .headers(headers_14),
          http("request_440")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/33a38ace667fc__190x91_moda_1.jpg")
            .headers(headers_14),
          http("request_441")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1a8c554a0f7d__190x91_electrodomesticos_1.jpg")
            .headers(headers_14),
          http("request_442")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1c160d58ccdef__190x91_hogar_1.jpg")
            .headers(headers_14),
          http("request_443")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2d5cb72be67b4__190x91_deporte_1.jpg")
            .headers(headers_14),
          http("request_444")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/2418f5b9f7b5e__a41b402303e2_on_bb4.jpg")
            .headers(headers_14),
          http("request_445")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/27a48df42b5b0__on_ts1.jpg")
            .headers(headers_14),
          http("request_446")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/1a244e1eedca6__on_ts2.jpg")
            .headers(headers_14),
          http("request_447")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/340b1cefc54c3__hd_on_cl_promotionalcmr.jpg")
            .headers(headers_14),
          http("request_448")
            .get("https://dynamic-yield.linio.com//api/scripts/8767679/images/31ca7a7d4bb0e__on_ts3.jpg")
            .headers(headers_14),
          http("request_449")
            .get(uri32 + "/tags?type=iframe&id=pr_Ep0NkTU4joacylgRKAPq_home&id=pr_Ep0NkTU4joacylgRKAPq_lid_CCG4MhPZfWoInE2KQEjt&su=https%3A%2F%2Fwww.linio.cl%2F&sr=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&ts=1630209144260&tc=1")
            .headers(headers_37),
          http("request_450")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%203&el=Nuevos%20usuarios%20-%20Todo%20a%20menos%20(Todo%20a%20menos)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209144821.7u39brlq&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=650223684")
            .headers(headers_3),
          http("request_451")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%204&el=Nuevos%20usuarios%20-%20Los%20m%C3%A1s%20vendidos%20(Los%20m%C3%A1s%20vendidos)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209144840.ql4wufch&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=1415296310")
            .headers(headers_3),
          http("request_452")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ESlider%205&el=Copy%20of%20H%7CB%7CV-5%7CG%7CNA%7CW34-Dormitorio%20(H%7CB%7CV-5%7CG%7CNA%7CW34-Dormitorio)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209144856.bhpwlb6h&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=797188609")
            .headers(headers_3),
          http("request_453")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Test%20-%20Mini%20Teasers%20Optimizacion&el=Optimizacion%20-%20Usuarios%20nuevos%20(Control%20Group%3A%20No%20Action)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209144881.f09y5vumb&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=772839754")
            .headers(headers_3),
          http("request_454")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3EHeader%20Solo%20Hoy&el=Contador%206%20(Header%20con%20Contador)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209144911.67miofve&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=282054957")
            .headers(headers_3),
          http("request_455")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%201&el=H%7CB%7CC3-1%7CG%7CNA%7CW35-Fitness%20(H%7CB%7CC3-1%7CG%7CNA%7CW35-Fitness)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209144974.50as48x5&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=1482508836")
            .headers(headers_3),
          http("request_456")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%202&el=H%7CB%7CC3-2%7CG%7CNA%7CW35-Ropa%20(H%7CB%7CC3-2%7CG%7CNA%7CW35-Ropa%20deportiva)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209144999.kvoo281h&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=911871953")
            .headers(headers_3),
          http("request_457")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3ETeaser%203&el=H%7CB%7CC3-3%7CG%7CNA%7CW35-Ciclismo%20(H%7CB%7CC3-3%7CG%7CNA%7CW35-Ciclismo)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209145023.wc0ktfj8&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=1707748990")
            .headers(headers_3),
          http("request_458")
            .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=DY%20Event%20%3A%3A%20DY%20Smart%20Object&ea=Linio%3EOnsite%3EDesktop%3EGeneric%20Banner%3EHomepage%3EPromocional%202&el=H%7CB%7CL%7CG%7CNA%7CW34-acumulapuntosCMR%20(H%7CB%7CL%7CG%7CNA%7CW34-acumulapuntosCMR)&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209145041.oogutnbl&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&z=2020473702")
            .headers(headers_3),
          http("request_459")
            .get(uri06 + "/api/v1/sync/a7f32eea-2f96-4ca2-a1fd-2184199629d3/web?callback=__jp0")
            .headers(headers_14),
          http("request_461")
            .get(uri41 + "/sampling-data-scripts/0013/6709.json?t=452835")
            .headers(headers_22),
          http("request_462")
            .get(uri16 + "/tr/?id=543671342917527&ev=PageView&dl=https%3A%2F%2Fwww.linio.cl%2F&rl=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&if=false&ts=1630209145224&sw=1366&sh=700&v=2.9.45&r=stable&a=seg&ec=0&o=30&fbp=fb.1.1630209072616.1834103300&it=1630209144667&coo=false&dpo=LDU&dpoco=0&dpost=0&exp=p0&rqm=GET")
            .headers(headers_3),
          http("request_463")
            .post(uri13 + "/t")
            .headers(headers_42)
            .body(RawFileBody("recordedsimulation/0463_request.txt")),
          http("request_465")
            .post(uri13 + "/p")
            .headers(headers_42)
            .body(RawFileBody("recordedsimulation/0465_request.txt")),
          http("request_466")
            .get(uri25 + "/963429843/?random=2101259462&cv=9&fst=1630209144512&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=700&u_w=1366&u_ah=700&u_aw=1366&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fwww.linio.cl%2F&ref=https%3A%2F%2Fwww.linio.cl%2Faccount%2Flogin&tiba=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&hn=www.googleadservices.com&async=1&fmt=3&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&ocp_id=eAQrYYXdIYy-owO4vpaACA&sscte=1&crd=")
            .headers(headers_3),
          http("request_467")
            .post(uri23 + "/batch?cnst=1&_=1630209145118_209167")
            .headers(headers_91)
            .body(RawFileBody("recordedsimulation/0467_request.txt")),
          http("request_468")
            .get(uri32 + "/extra-resources?ti=Ep0NkTU4joacylgRKAPq")
            .headers(headers_64),
          http("request_469")
            .post(uri23 + "/uia?cnst=1&_=1630209144755")
            .headers(headers_22)
            .formParam("msn", "webserve-46c5bc8.use")
            .formParam("id", "-3030922298482031569")
            .formParam("se", "8767679")
            .formParam("cl", "dk.w.c.ms.")
            .formParam("rf", "internal")
            .formParam("trf", "0")
            .formParam("p", "3")
            .formParam("sub", "www.linio.cl")
            .formParam("sd", "")
            .formParam("url", "https://www.linio.cl/")
            .formParam("title", "Linio Chile I Grandes ofertas y promociones todo el año")
            .formParam("lay", "def")
            .formParam("ses", "527763133d467336e8964dde46a59047")
            .formParam("aud", "1474936.350117.401657.401659.680587")
            .formParam("svars", "1359:@:false.@.1360:@:false.@.1423:@:false")
            .formParam("gv", "")
            .formParam("exps", """[["224534","8989788","6772166",0,null,null,"3913585303591300795","2","3"],["339530","3704074","9870482",0,null,null,"3913585305388467307","1",null],["368089","3949560","10596091",0,null,null,"3913585306572009774","1",null],["1139502","10405946","26282918",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282921",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282923",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282926",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282919",0,null,null,"3913585303770245348","2","3"],["1139502","10405946","26282924",0,null,null,"3913585303770245348","2","3"]]""")
            .formParam("lts", "9:22")
            .formParam("ctx", """{"type":"HOMEPAGE"}""")
            .formParam("lpInfo", "false")
            .formParam("expSes", "7888")
            .formParam("br", "Other")
            .formParam("tsrc", "Direct")
            .formParam("geoData", "IN_MH_Pune")
            .formParam("feedProps[categories]", "")
            .formParam("feedProps[keywords]", "")
            .formParam("cookieInfo", "0.0.971")
            .formParam("reqts", "1630209143747")
            .formParam("rri", "2711896")
            .formParam("nocks", "false"),
          http("request_470")
            .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dexd%26site_type%3Dd%26ci%3Dd07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&p1=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=38455")
            .headers(headers_1),
          http("request_471")
            .get(uri21 + "?a=69657&v=5.7.1&p0=e%3Dvh&p1=e%3Dexd%26ci%3Dd07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894%26site_type%3Dd&p2=e%3Ddis%26a%3D%255B14897%252C69657%255D&adce=1&tld=linio.cl&dtycbr=38052")
            .headers(headers_1),
          http("request_472")
            .get(uri21 + "?a=14897&v=5.7.1&p0=e%3Dexd%26ci%3Dd07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894%26site_type%3Dd&p1=e%3Dvh&p2=e%3Ddis&adce=1&tld=linio.cl&dtycbr=194")
            .headers(headers_1),
          http("request_474")
            .post(uri10 + "/api/catalog/personalized-feed/Row%203%20-%20Recomendaciones/homepage")
            .headers(headers_474),
          http("request_475")
            .post(uri10 + "/api/catalog/personalized-feed/Row%204%20-%20Recomendaciones/homepage")
            .headers(headers_474),
          http("request_476")
            .get(uri37 + "/p/a7ede4cd8cdcc99566db21bad29e445d-card.webp")
            .headers(headers_14),
          http("request_477")
            .get(uri37 + "/p/8e69ee33514b3be763db02ad7f4676f8-card.webp")
            .headers(headers_14),
          http("request_478")
            .get(uri37 + "/p/4441687924dd4607d13be48290e11e3e-card.webp")
            .headers(headers_14),
          http("request_479")
            .get(uri37 + "/p/94bda0a8b4c6d88a5b9203e3934db21b-card.webp")
            .headers(headers_14),
          http("request_480")
            .post(uri10 + "/api/catalog/personalized-feed/Row%201%20-%20Recomendaciones/homepage")
            .headers(headers_474),
          http("request_481")
            .post(uri10 + "/api/catalog/personalized-feed/Row%202%20-%20Recomendaciones/homepage")
            .headers(headers_474),
          http("request_483")
            .get(uri23 + "/imp?cnst=1&msn=webserve-46c5bc8.use&id=-3030922298482031569&sec=8767679&imps%5B0%5D=dy_unit%7Csmart_object_1135805%7C%7C280%7C%7C%7C&imps%5B1%5D=dy_unit%7Csmart_object_830067%7C%7C280%7C%7C%7C&imps%5B2%5D=dy_unit%7Csmart_object_833083%7C%7C280%7C%7C%7C&imps%5B3%5D=dy_unit%7Csmart_object_1135814%7C%7C280%7C%7C%7C&imps%5B4%5D=dy_unit%7Csmart_object_1126119_26282918%7C%7C621%7C%7C%7C&imps%5B5%5D=dy_unit%7Csmart_object_1126119_26282921%7C%7C621%7C%7C%7C&imps%5B6%5D=dy_unit%7Csmart_object_1126119_26282923%7C%7C621%7C%7C%7C&imps%5B7%5D=dy_unit%7Csmart_object_1126119_26282926%7C%7C621%7C%7C%7C&imps%5B8%5D=dy_unit%7Csmart_object_1126119_26282919%7C%7C621%7C%7C%7C&imps%5B9%5D=dy_unit%7Csmart_object_1126119_26282924%7C%7C621%7C%7C%7C&imps%5B10%5D=dy_unit%7Csmart_object_1041322%7C%7C768%7C%7C%7C&imps%5B11%5D=dy_unit%7Csmart_object_1135934%7C%7C1513%7C%7C%7C&imps%5B12%5D=dy_unit%7Csmart_object_1135941%7C%7C1513%7C%7C%7C&imps%5B13%5D=dy_unit%7Csmart_object_1135943%7C%7C1513%7C%7C%7C&imps%5B14%5D=dy_unit%7Csmart_object_1133535%7C%7C3507%7C%7C%7C&cl=dk.w.c.ms.&bl=0&l=def&p=3&sd=&rf=internal&trf=0&sr=1366x700&ses=527763133d467336e8964dde46a59047&aud=1474936.350117.401657.401659.680587&svars=1359%3A%40%3Afalse.%40.1360%3A%40%3Afalse.%40.1423%3A%40%3Afalse&url=https%3A%2F%2Fwww.linio.cl%2F&exps=%5B%5B%22224534%22%2C%228989788%22%2C%226772166%22%2C0%2Cnull%2Cnull%2C%223913585303591300795%22%2C%222%22%2C%223%22%5D%2C%5B%22339530%22%2C%223704074%22%2C%229870482%22%2C0%2Cnull%2Cnull%2C%223913585305388467307%22%2C%221%22%2Cnull%5D%2C%5B%22368089%22%2C%223949560%22%2C%2210596091%22%2C0%2Cnull%2Cnull%2C%223913585306572009774%22%2C%221%22%2Cnull%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282918%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282921%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282923%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282926%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282919%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%2C%5B%221139502%22%2C%2210405946%22%2C%2226282924%22%2C0%2Cnull%2Cnull%2C%223913585303770245348%22%2C%222%22%2C%223%22%5D%5D&expSes=7888&reqts=1630209145816&rri=1247629&_=1630209145818")
            .headers(headers_22),
          http("request_484")
            .get(uri37 + "/p/bac3e2cc3677bdedce8aa8950e2d3a9f-card.webp")
            .headers(headers_14),
          http("request_485")
            .get(uri37 + "/p/535579cc9f6bcb1500699fe7b9f184ac-card.webp")
            .headers(headers_14),
          http("request_486")
            .get(uri37 + "/p/538eb50c75b20361e577fa89db982253-card.webp")
            .headers(headers_14),
          http("request_487")
            .get(uri37 + "/p/27f738d915547509ffd5e329dfad4081-card.webp")
            .headers(headers_14),
          http("request_488")
            .get(uri37 + "/p/6b82d3178c4d688692debafc7691ad96-card.webp")
            .headers(headers_14),
          http("request_489")
            .get(uri37 + "/p/e10e8c290c1962b55d2aa97d4b0219a8-card.webp")
            .headers(headers_14),
          http("request_490")
            .get(uri37 + "/p/10059aaf4fa3d6a98f4a88e79d29c447-card.webp")
            .headers(headers_14),
          http("request_491")
            .get(uri37 + "/p/691c676c0528bf25388bb3d41bc62bf7-card.webp")
            .headers(headers_14),
          http("request_492")
            .get(uri37 + "/p/81a80a875773108720445306a65a83ec-card.webp")
            .headers(headers_14),
          http("request_493")
            .get(uri37 + "/p/1803ef5bf015a9bd4dc827816005034f-card.webp")
            .headers(headers_14),
          http("request_494")
            .get(uri37 + "/p/1291350fe5f648d02af986e2af8b0004-card.webp")
            .headers(headers_14),
          http("request_495")
            .get(uri37 + "/p/d21657e219c6369e47c1b35bbc097dcd-card.webp")
            .headers(headers_14),
          http("request_496")
            .get(uri37 + "/p/6865b748205b107b445edbcc0e4c01de-card.webp")
            .headers(headers_14),
          http("request_497")
            .get(uri37 + "/p/3b6b6b2e86033ebd76efe2e5a7ff5150-card.webp")
            .headers(headers_14),
          http("request_498")
            .get(uri37 + "/p/0c78b816e4f3e3c924f7c5cec20a3dc2-card.webp")
            .headers(headers_14),
          http("request_499")
            .get(uri37 + "/p/9e93ccc63db1f294329a47accfdd0198-card.webp")
            .headers(headers_14),
          http("request_500")
            .get(uri37 + "/p/df5b6322c6e8a0c3bcbd416ad3dfc1d3-card.webp")
            .headers(headers_14),
          http("request_501")
            .get(uri37 + "/p/d15bf211b0762668ad1c4742fc9a2d12-card.webp")
            .headers(headers_14),
          http("request_502")
            .get(uri37 + "/p/0546b80dc0703589adabdaf551acad68-card.webp")
            .headers(headers_14),
          http("request_503")
            .get(uri37 + "/p/e33b8424659781afcc72dec4635aeb89-card.webp")
            .headers(headers_14),
          http("request_504")
            .get(uri37 + "/p/c0cd3d1d857e2443d3c47d9c0539205a-card.webp")
            .headers(headers_14),
          http("request_505")
            .get(uri37 + "/p/ea79f3aca1d598fdad4c52b3285640dd-card.webp")
            .headers(headers_14),
          http("request_506")
            .get(uri37 + "/p/3e4a77a0f95e73bf9a072fbff537e0cc-card.webp")
            .headers(headers_14),
          http("request_507")
            .get(uri37 + "/p/475ca316084c800e33be57d0889949ef-card.webp")
            .headers(headers_14),
          http("request_508")
            .get(uri37 + "/p/d4c88b43c1a9f1ae8cc04cfea8c04ed9-card.webp")
            .headers(headers_14),
          http("request_509")
            .get(uri37 + "/p/f9a4d32585beb3678dd9cf75bf0a5320-card.webp")
            .headers(headers_14),
          http("request_510")
            .get(uri37 + "/p/1eededaef55cfc5f9d012ad17a6c7d48-card.webp")
            .headers(headers_14),
          http("request_511")
            .get(uri37 + "/p/d0eab973742a6324ebc99df8a7b1067a-card.webp")
            .headers(headers_14),
          http("request_512")
            .get(uri37 + "/p/fb10bcb7bff584081239169beff6151c-card.webp")
            .headers(headers_14),
          http("request_513")
            .get(uri37 + "/p/bcaecda6ac0b6b3615d26e443471f878-card.webp")
            .headers(headers_3),
          http("request_514")
            .get(uri37 + "/p/d2b730be4c8cda4d5e8489b2eb93711e-card.webp")
            .headers(headers_3),
          http("request_515")
            .get(uri37 + "/p/4146bce4fee63b5499a5b2018c38ca36-card.webp")
            .headers(headers_3),
          http("request_516")
            .get(uri23 + "/var?cnst=1&_=759226&msn=webserve-46c5bc8.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=3&ve=10405946&va=%5B%7B%22id%22%3A26282924%2C%22idx%22%3A5%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474936.350117.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=1&tsrc=Direct&reqts=1630209145901&rri=7045792")
            .headers(headers_22),
          http("request_517")
            .get(uri23 + "/var?cnst=1&_=201711&msn=webserve-46c5bc8.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=3&ve=10405946&va=%5B%7B%22id%22%3A26282919%2C%22idx%22%3A4%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474936.350117.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209145903&rri=7947974")
            .headers(headers_22),
          http("request_518")
            .get(uri37 + "/p/acc21f22f7b9cd5019ff5f799034cb86-card.webp")
            .headers(headers_3),
          http("request_519")
            .get(uri23 + "/var?cnst=1&_=784629&msn=webserve-46c5bc8.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=3&ve=10405946&va=%5B%7B%22id%22%3A26282926%2C%22idx%22%3A3%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474936.350117.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209145903&rri=9875946")
            .headers(headers_22),
          http("request_520")
            .get(uri23 + "/var?cnst=1&_=736363&msn=webserve-46c5bc8.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=3&ve=10405946&va=%5B%7B%22id%22%3A26282923%2C%22idx%22%3A2%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474936.350117.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209145904&rri=1798317")
            .headers(headers_22),
          http("request_521")
            .get(uri37 + "/p/5b20dd80dc14f75fbe9fff88a35f0d35-card.webp")
            .headers(headers_3),
          http("request_522")
            .get(uri23 + "/var?cnst=1&_=234700&msn=webserve-46c5bc8.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=3&ve=10405946&va=%5B%7B%22id%22%3A26282921%2C%22idx%22%3A1%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474936.350117.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209145904&rri=2165650")
            .headers(headers_22),
          http("request_523")
            .get(uri23 + "/var?cnst=1&_=139604&msn=webserve-46c5bc8.use&uid=-3030922298482031569&sec=8767679&t=ri&e=1139502&p=3&ve=10405946&va=%5B%7B%22id%22%3A26282918%2C%22idx%22%3A0%7D%5D&ses=527763133d467336e8964dde46a59047&expSes=7888&aud=1474936.350117.401657.401659.680587&expVisitId=3913585303770245348&mech=2&smech=3&eri=0&tsrc=Direct&reqts=1630209145905&rri=3687189")
            .headers(headers_22),
          http("request_524")
            .get(uri37 + "/p/84b9d36931f4330c0dda3f9cf75d63e5-card.webp")
            .headers(headers_3),
          http("request_525")
            .get(uri37 + "/p/f8b19aefc22e820da3dd7b177d15494b-card.webp")
            .headers(headers_3),
          http("request_526")
            .get(uri37 + "/p/40a9caf62e9fde1cbf51f83974f01635-card.webp")
            .headers(headers_3),
          http("request_527")
            .get(uri37 + "/p/801ef6699c0e719f950a2b468d72f4e7-card.webp")
            .headers(headers_3),
          http("request_528")
            .get(uri37 + "/p/e27dcde67d62efc39bbac23754f3bf8e-card.webp")
            .headers(headers_3),
          http("request_529")
            .get(uri37 + "/p/eaa2d53678990b0387c2b7d2e5661bf9-card.webp")
            .headers(headers_3),
          http("request_530")
            .get(uri37 + "/p/5040b30497b8f729bad2e54a10043480-card.webp")
            .headers(headers_3),
          http("request_531")
            .get(uri37 + "/p/ae6d7b3fe8228d968c6183723f45e64f-card.webp")
            .headers(headers_3),
          http("request_532")
            .get(uri37 + "/p/3d45a25ad4c88c81d9a2d670b50e6ed5-card.webp")
            .headers(headers_3),
          http("request_533")
            .get(uri37 + "/p/48905ff40fe99d4889ccf6d0262eee7c-card.webp")
            .headers(headers_3),
          http("request_534")
            .get(uri37 + "/p/4666e39b4a034650a30560aeb7ff87e1-card.webp")
            .headers(headers_3),
          http("request_535")
            .get(uri37 + "/p/be7129327e1ae86c56639afc41665c5b-card.webp")
            .headers(headers_3),
          http("request_536")
            .get(uri37 + "/p/dc5fdd180749b0062bce6cddb8b96d76-card.webp")
            .headers(headers_3),
          http("request_537")
            .get(uri37 + "/p/38338066a90d16d7718fba8f94714227-card.webp")
            .headers(headers_3),
          http("request_538")
            .get(uri37 + "/p/108e88e958add3c3fb76eb26b2cf7a4a-card.webp")
            .headers(headers_3),
          http("request_539")
            .get(uri37 + "/p/c13c6634e1238d3f9df3fb51eea227c2-card.webp")
            .headers(headers_3),
          http("request_540")
            .get(uri37 + "/p/ee4f02a639ed0f1ae6605841da5ffbdd-card.webp")
            .headers(headers_3),
          http("request_541")
            .get(uri37 + "/p/caedd45fccb00e93cf3a6fe0836022e3-card.webp")
            .headers(headers_3),
          http("request_542")
            .get(uri37 + "/p/e38d4a77175b8ef44a3c3cb0da9286f5-card.webp")
            .headers(headers_3),
          http("request_543")
            .get(uri37 + "/p/e9d97ae1a1319cc82ab5f99b62a43302-card.webp")
            .headers(headers_3),
          http("request_544")
            .get(uri37 + "/p/30810ba526a60cd3f75d12c068c29f37-card.webp")
            .headers(headers_3),
          http("request_545")
            .get(uri37 + "/p/a02f712eb7e743d40348ce4b7aeae1a4-card.webp")
            .headers(headers_3),
          http("request_546")
            .get(uri37 + "/p/5726255d5e1ae09b499d4cdc7644cf91-card.webp")
            .headers(headers_3),
          http("request_547")
            .get(uri37 + "/p/e66d8a72e85adb4c6e0a21ec5b0af7a7-card.webp")
            .headers(headers_3),
          http("request_548")
            .get(uri37 + "/p/f39a9cb4644665044707f014fe0906f4-card.webp")
            .headers(headers_3),
          http("request_549")
            .get(uri37 + "/p/18072a0b4044e5af4a989a2d0d973110-card.webp")
            .headers(headers_3),
          http("request_550")
            .get(uri37 + "/p/2d6fd68763e9b6871ade27656e1e418c-card.webp")
            .headers(headers_3),
          http("request_551")
            .get(uri37 + "/p/2c79f4246f51476daef1bfead75ca877-card.webp")
            .headers(headers_3),
          http("request_552")
            .get(uri37 + "/p/b1d3633141757b8fc70e68e1c54bbb2e-card.webp")
            .headers(headers_3),
          http("request_553")
            .get(uri37 + "/p/53ccbca01f464762277655882a80d895-card.webp")
            .headers(headers_3),
          http("request_554")
            .get(uri37 + "/p/612f50d7e4fbc5ce9c0b64a4eeba23dc-card.webp")
            .headers(headers_3),
          http("request_555")
            .get(uri37 + "/p/23581f9fdeb0041ffae18e439b9552f6-card.webp")
            .headers(headers_3),
          http("request_556")
            .get(uri37 + "/p/8a210ec1bb98809ea03c67a17c01b8dc-card.webp")
            .headers(headers_3),
          http("request_557")
            .get(uri37 + "/p/9ce78ecb5f5189bf4185693998ead5eb-card.webp")
            .headers(headers_3),
          http("request_558")
            .get(uri37 + "/p/f9c1f6443ccdd631c1cdc6e23d0081c6-card.webp")
            .headers(headers_3),
          http("request_559")
            .get(uri37 + "/p/8da759d56ead4b60979b9b74a2f3365b-card.webp")
            .headers(headers_3),
          http("request_560")
            .get(uri37 + "/p/dae598ac6f896a9308d6443ad4117db2-card.webp")
            .headers(headers_3),
          http("request_561")
            .get(uri37 + "/p/ab51b1a71c92d7be08396a815f9338cb-card.webp")
            .headers(headers_3),
          http("request_562")
            .get(uri37 + "/p/13ef39fc8bbd3694d3a4786671a6af04-card.webp")
            .headers(headers_3),
          http("request_563")
            .get(uri37 + "/p/833664c33f4e6c4c8ae186231f8f7b58-card.webp")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_568")
        .get("/collect?v=1&_v=j93&a=45473462&t=event&ni=1&cu=CLP&_s=1&dl=https%3A%2F%2Fwww.linio.cl%2F&ul=en-in&de=UTF-8&dt=Linio%20Chile%20I%20Grandes%20ofertas%20y%20promociones%20todo%20el%20a%C3%B1o&sd=24-bit&sr=1366x700&vp=1350x700&je=0&ec=Ecommerce&ea=Impressions&el=&xid=0&xvar=0&_u=SCCACEILRAAAAG~&jid=&gjid=&cid=1624135901.1630209072&uid=8415141c-087c-11ec-9a91-0292d8531895&tid=UA-49693852-1&_gid=1875921855.1630209072&gtm=2wg8p0PTM8PD&cd3=1630209163186.26ymu8h&cd4=d07bd00d96631718e192e4b61d335457e2f3733ff1266dad520b7844d889d894&cd14=8415141c-087c-11ec-9a91-0292d8531895&promo1id=https%3A%2F%2Fdynamic-yield.linio.com%2F%2Fapi%2Fscripts%2F8767679%2Fimages%2F1f5c32beffc62__onbb_compras_nuevosusuarios_co.jpg%20%3A%3A%20https%3A%2F%2Fwww.linio.cl%2Fcm%2Fmejores-deals&promo1nm=Los%20m%C3%A1s%20vendidos&promo1ps=9%2F80&promo1cr=%2F%20%3A%3A%20home%20%3A%3A%20Los%20m%C3%A1s%20vendidos&z=520060771")
        .headers(headers_3))
      .pause(2)
      .exec(http("request_569")
        .get(uri06 + "/sdks/OneSignalSDKStyles.css?v=2")
        .headers(headers_14))


//    setUp(
//    scn.inject(rampUsers(10).during(10.seconds)),
//  ).protocols(httpProtocol)
      setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}