package com.example.asheransari.bookudacity;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/14/2016.
 */
public final class QueryUtil {

    private static final String LOG_TAG = QueryUtil.class.getName();

    private static final String BOOK_JSON_RESPONSE="{\n" +
            " \"kind\": \"books#volume\",\n" +
            " \"id\": \"beSP5CCpiGUC\",\n" +
            " \"etag\": \"ebLTzEJtrUQ\",\n" +
            " \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/beSP5CCpiGUC\",\n" +
            " \"volumeInfo\": {\n" +
            "  \"title\": \"The 1989 World Book year book\",\n" +
            "  \"subtitle\": \"a review of the events of 1988 ; the annual supplement to the World book encyclopedia\",\n" +
            "  \"authors\": [\n" +
            "   \"Robert O. Zeleny\"\n" +
            "  ],\n" +
            "  \"publisher\": \"World Book\",\n" +
            "  \"publishedDate\": \"1989-02-01\",\n" +
            "  \"industryIdentifiers\": [\n" +
            "   {\n" +
            "    \"type\": \"ISBN_10\",\n" +
            "    \"identifier\": \"0716604892\"\n" +
            "   },\n" +
            "   {\n" +
            "    \"type\": \"ISBN_13\",\n" +
            "    \"identifier\": \"9780716604891\"\n" +
            "   }\n" +
            "  ],\n" +
            "  \"readingModes\": {\n" +
            "   \"text\": false,\n" +
            "   \"image\": false\n" +
            "  },\n" +
            "  \"pageCount\": 576,\n" +
            "  \"printedPageCount\": 584,\n" +
            "  \"dimensions\": {\n" +
            "   \"height\": \"26.00 cm\"\n" +
            "  },\n" +
            "  \"printType\": \"BOOK\",\n" +
            "  \"categories\": [\n" +
            "   \"Encyclopedias and dictionaries\",\n" +
            "   \"History\",\n" +
            "   \"Yearbooks\",\n" +
            "   \"Reference / Yearbooks & Annuals\"\n" +
            "  ],\n" +
            "  \"maturityRating\": \"NOT_MATURE\",\n" +
            "  \"allowAnonLogging\": false,\n" +
            "  \"contentVersion\": \"preview-1.0.0\",\n" +
            "  \"imageLinks\": {\n" +
            "   \"smallThumbnail\": \"http://books.google.com/books/content?id=beSP5CCpiGUC&printsec=frontcover&img=1&zoom=5&imgtk=AFLRE71jxC-Jc5Db-G2X_PtX4jrruIlLLzXUX8ylBGgIqXBlL1Oyn8QW1iIASBW-NGsHnmJW6z_KSAP03s_zRd8kIg5iCZBI7uyUsja-AXn6KhXNZBWM7a4&source=gbs_api\",\n" +
            "   \"thumbnail\": \"http://books.google.com/books/content?id=beSP5CCpiGUC&printsec=frontcover&img=1&zoom=1&imgtk=AFLRE71UUMYy_DTfHZfiUpVlTv00QSr9MOwTrJNs7A3Dzl1ps-0f7u1ZK3bo1gxIYRXsDzxclaCbTJcIenporDyKe1BIX6QQbL7lTLDv7-hiAASwly48R6g&source=gbs_api\",\n" +
            "   \"small\": \"http://books.google.com/books/content?id=beSP5CCpiGUC&printsec=frontcover&img=1&zoom=2&imgtk=AFLRE73CAISbaGO-e28-zzP3YYfVUFb1xkbNsEDEY_r79HRgrT2i5tdvCEaf4Q1mU12uIZ8oAmVRvUj9uOMyLjgPdAjYVvpw3Xyk9dtr2L29hgjR34mVjto&source=gbs_api\",\n" +
            "   \"medium\": \"http://books.google.com/books/content?id=beSP5CCpiGUC&printsec=frontcover&img=1&zoom=3&imgtk=AFLRE7068agrSvrrcWNLo8uaSgOxgrUQqqql0qUK55RtGCqJHhusu5Ege1WNyURPYDSIgw9qSr_5kTyhQbkbVlhg9BGhhNdppoSwrS8UxElpc3LIHmItKCU&source=gbs_api\",\n" +
            "   \"large\": \"http://books.google.com/books/content?id=beSP5CCpiGUC&printsec=frontcover&img=1&zoom=4&imgtk=AFLRE71kTqO_hhzLOxwM6JEH3lwrWA1zeha25WhtdAnDV2yQekaXKHdqAsnLn5iCI-xZMcu3VExlGfcyyE-RaaTNiXZhBMBBOOausYsdRz4Z8aR_-pb21Qw&source=gbs_api\",\n" +
            "   \"extraLarge\": \"http://books.google.com/books/content?id=beSP5CCpiGUC&printsec=frontcover&img=1&zoom=6&imgtk=AFLRE708oMsYiZhXJeq0USQiAIcrpnlU1vVLaAjrmiOgDm8yTVnhZODTz5XBYRrcaeiKRf72a_bd7XSsCRzvLDK2orOuTfkwbnyQTf2-BMylEFmLB9CzKyw&source=gbs_api\"\n" +
            "  },\n" +
            "  \"language\": \"en\",\n" +
            "  \"previewLink\": \"http://books.google.com/books?id=beSP5CCpiGUC&hl=&source=gbs_api\",\n" +
            "  \"infoLink\": \"https://play.google.com/store/books/details?id=beSP5CCpiGUC&source=gbs_api\",\n" +
            "  \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-beSP5CCpiGUC\"\n" +
            " },\n" +
            " \"saleInfo\": {\n" +
            "  \"country\": \"PK\",\n" +
            "  \"saleability\": \"NOT_FOR_SALE\",\n" +
            "  \"isEbook\": false\n" +
            " },\n" +
            " \"accessInfo\": {\n" +
            "  \"country\": \"PK\",\n" +
            "  \"viewability\": \"NO_PAGES\",\n" +
            "  \"embeddable\": false,\n" +
            "  \"publicDomain\": false,\n" +
            "  \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "  \"epub\": {\n" +
            "   \"isAvailable\": false\n" +
            "  },\n" +
            "  \"pdf\": {\n" +
            "   \"isAvailable\": false\n" +
            "  },\n" +
            "  \"webReaderLink\": \"http://books.google.com/books/reader?id=beSP5CCpiGUC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
            "  \"accessViewStatus\": \"NONE\",\n" +
            "  \"quoteSharingAllowed\": false\n" +
            " }\n" +
            "}";
//            "{{\n" +
//            " \"kind\": \"books#volumes\",\n" +
//            " \"totalItems\": 1279,\n" +
//            " \"items\": [\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"HpHcGAkFEjkC\",\n" +
//            "   \"etag\": \"VbHJG4uDLAA\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/HpHcGAkFEjkC\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"Big Data\",\n" +
//            "    \"subtitle\": \"A Revolution That Will Transform How We Live, Work, and Think\",\n" +
//            "    \"authors\": [\n" +
//            "     \"Viktor Mayer-Schönberger\",\n" +
//            "     \"Kenneth Cukier\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"Houghton Mifflin Harcourt\",\n" +
//            "    \"publishedDate\": \"2013-03-05\",\n" +
//            "    \"description\": \"A revelatory exploration of the hottest trend in technology and the dramatic impact it will have on the economy, science, and society at large. Which paint color is most likely to tell you that a used car is in good shape? How can officials identify the most dangerous New York City manholes before they explode? And how did Google searches predict the spread of the H1N1 flu outbreak? The key to answering these questions, and many more, is big data. “Big data” refers to our burgeoning ability to crunch vast collections of information, analyze it instantly, and draw sometimes profoundly surprising conclusions from it. This emerging science can translate myriad phenomena—from the price of airline tickets to the text of millions of books—into searchable form, and uses our increasing computing power to unearth epiphanies that we never could have seen before. A revolution on par with the Internet or perhaps even the printing press, big data will change the way we think about business, health, politics, education, and innovation in the years to come. It also poses fresh threats, from the inevitable end of privacy as we know it to the prospect of being penalized for things we haven’t even done yet, based on big data’s ability to predict our future behavior. In this brilliantly clear, often surprising work, two leading experts explain what big data is, how it will change our lives, and what we can do to protect ourselves from its hazards. Big Data is the first big book about the next big thing. www.big-data-book.com\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9780544002937\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"0544002938\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": true,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 240,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Business & Economics\"\n" +
//            "    ],\n" +
//            "    \"averageRating\": 3.0,\n" +
//            "    \"ratingsCount\": 6,\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": true,\n" +
//            "    \"contentVersion\": \"2.14.14.0.preview.3\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=HpHcGAkFEjkC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=HpHcGAkFEjkC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=HpHcGAkFEjkC&printsec=frontcover&dq=data&hl=&cd=1&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=HpHcGAkFEjkC&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/Big_Data.html?hl=&id=HpHcGAkFEjkC\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"PARTIAL\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": true,\n" +
//            "     \"acsTokenLink\": \"http://books.google.com/books/download/Big_Data-sample-epub.acsm?id=HpHcGAkFEjkC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": true,\n" +
//            "     \"acsTokenLink\": \"http://books.google.com/books/download/Big_Data-sample-pdf.acsm?id=HpHcGAkFEjkC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=HpHcGAkFEjkC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"In this brilliantly clear, often surprising work, two leading experts explain what big data is, how it will change our lives, and what we can do to protect ourselves from its hazards. Big Data is the first big book about the next big thing.\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"zxNglqU1FKgC\",\n" +
//            "   \"etag\": \"cz4UOrdL8LY\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/zxNglqU1FKgC\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"Beautiful Data\",\n" +
//            "    \"subtitle\": \"The Stories Behind Elegant Data Solutions\",\n" +
//            "    \"authors\": [\n" +
//            "     \"Toby Segaran\",\n" +
//            "     \"Jeff Hammerbacher\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"\\\"O'Reilly Media, Inc.\\\"\",\n" +
//            "    \"publishedDate\": \"2009-07-14\",\n" +
//            "    \"description\": \"In this insightful book, you'll learn from the best data practitioners in the field just how wide-ranging -- and beautiful -- working with data can be. Join 39 contributors as they explain how they developed simple and elegant solutions on projects ranging from the Mars lander to a Radiohead video. With Beautiful Data, you will: Explore the opportunities and challenges involved in working with the vast number of datasets made available by the Web Learn how to visualize trends in urban crime, using maps and data mashups Discover the challenges of designing a data processing system that works within the constraints of space travel Learn how crowdsourcing and transparency have combined to advance the state of drug research Understand how new data can automatically trigger alerts when it matches or overlaps pre-existing data Learn about the massive infrastructure required to create, capture, and process DNA data That's only small sample of what you'll find in Beautiful Data. For anyone who handles data, this is a truly fascinating book. Contributors include: Nathan Yau Jonathan Follett and Matt Holm J.M. Hughes Raghu Ramakrishnan, Brian Cooper, and Utkarsh Srivastava Jeff Hammerbacher Jason Dykes and Jo Wood Jeff Jonas and Lisa Sokol Jud Valeski Alon Halevy and Jayant Madhavan Aaron Koblin with Valdean Klump Michal Migurski Jeff Heer Coco Krumme Peter Norvig Matt Wood and Ben Blackburne Jean-Claude Bradley, Rajarshi Guha, Andrew Lang, Pierre Lindenbaum, Cameron Neylon, Antony Williams, and Egon Willighagen Lukas Biewald and Brendan O'Connor Hadley Wickham, Deborah Swayne, and David Poole Andrew Gelman, Jonathan P. Kastellec, and Yair Ghitza Toby Segaran\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9781449379292\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"144937929X\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": true,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 386,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Computers\"\n" +
//            "    ],\n" +
//            "    \"averageRating\": 4.0,\n" +
//            "    \"ratingsCount\": 5,\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": true,\n" +
//            "    \"contentVersion\": \"0.3.2.0.preview.3\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=zxNglqU1FKgC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=zxNglqU1FKgC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=zxNglqU1FKgC&printsec=frontcover&dq=data&hl=&cd=2&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=zxNglqU1FKgC&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/Beautiful_Data.html?hl=&id=zxNglqU1FKgC\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"PARTIAL\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": true\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": true\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=zxNglqU1FKgC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"In this insightful book, you&#39;ll learn from the best data practitioners in the field just how wide-ranging -- and beautiful -- working with data can be.\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"SxPzSTcTalAC\",\n" +
//            "   \"etag\": \"sfs//w0tMLs\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/SxPzSTcTalAC\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"Purely Functional Data Structures\",\n" +
//            "    \"authors\": [\n" +
//            "     \"Chris Okasaki\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"Cambridge University Press\",\n" +
//            "    \"publishedDate\": \"1999-06-13\",\n" +
//            "    \"description\": \"This book describes data structures and data structure design techniques for functional languages.\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"0521663504\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9780521663502\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": false,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 220,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Computers\"\n" +
//            "    ],\n" +
//            "    \"averageRating\": 4.0,\n" +
//            "    \"ratingsCount\": 5,\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": false,\n" +
//            "    \"contentVersion\": \"2.0.0.0.preview.1\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=SxPzSTcTalAC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=SxPzSTcTalAC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=SxPzSTcTalAC&printsec=frontcover&dq=data&hl=&cd=3&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=SxPzSTcTalAC&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/Purely_Functional_Data_Structures.html?hl=&id=SxPzSTcTalAC\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"PARTIAL\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": false\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": false\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=SxPzSTcTalAC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"This book describes data structures and data structure design techniques for functional languages.\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"YIyEZaKcuiwC\",\n" +
//            "   \"etag\": \"dUjcHuGJsr8\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/YIyEZaKcuiwC\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"Data Communications Principles\",\n" +
//            "    \"authors\": [\n" +
//            "     \"Richard D. Gitlin\",\n" +
//            "     \"Jeremiah Hayes\",\n" +
//            "     \"Stephen B. Weinstein\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"Springer Science & Business Media\",\n" +
//            "    \"publishedDate\": \"1992-09-30\",\n" +
//            "    \"description\": \"Offers coverage of the basic principles of data communications and covers such material as phase and timing recovery and echo cancellation. This book contains exercises and applications that illustrate the material. It is intended for both first year graduate students and newcomers to the field.\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"0306437775\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9780306437779\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": false,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 733,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Computers\"\n" +
//            "    ],\n" +
//            "    \"averageRating\": 2.0,\n" +
//            "    \"ratingsCount\": 1,\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": false,\n" +
//            "    \"contentVersion\": \"preview-1.0.0\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=YIyEZaKcuiwC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=YIyEZaKcuiwC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=YIyEZaKcuiwC&printsec=frontcover&dq=data&hl=&cd=4&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=YIyEZaKcuiwC&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/Data_Communications_Principles.html?hl=&id=YIyEZaKcuiwC\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"PARTIAL\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": false\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": true,\n" +
//            "     \"acsTokenLink\": \"http://books.google.com/books/download/Data_Communications_Principles-sample-pdf.acsm?id=YIyEZaKcuiwC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=YIyEZaKcuiwC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"Offers coverage of the basic principles of data communications and covers such material as phase and timing recovery and echo cancellation. This book contains exercises and applications that illustrate the material.\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"UT9dAAAAIAAJ\",\n" +
//            "   \"etag\": \"lh6Ss/0GmAI\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/UT9dAAAAIAAJ\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"Exploratory Data Analysis\",\n" +
//            "    \"authors\": [\n" +
//            "     \"John Wilder Tukey\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"Pearson College Division\",\n" +
//            "    \"publishedDate\": \"1977-01-01\",\n" +
//            "    \"description\": \"Scratching down numbers (stem-and-leaf); Schematic summaries (pictures and numbers); Easy re-expression; Effective comparison (including well-chosen expresion); Plots of relationship; Straightening out plots (using three points); Smoothing sequences; Optional sections for chapter 7; Parallel and wandering schematic plots; Delineations of batches of points; Using two-way analyses; Making two-way analyses; Advances fits; Three-way fits; Looking in two or more ways at batches of points; Counted fractions; Better smoothing; Counts in bin after bin; Product-ratio plots; Shapes of distribution; Mathematical distributions; Postscript.\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"OTHER\",\n" +
//            "      \"identifier\": \"STANFORD:36105001914998\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": false,\n" +
//            "     \"image\": false\n" +
//            "    },\n" +
//            "    \"pageCount\": 688,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Mathematics\"\n" +
//            "    ],\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": false,\n" +
//            "    \"contentVersion\": \"1.1.0.0.preview.0\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=UT9dAAAAIAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=UT9dAAAAIAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=UT9dAAAAIAAJ&q=data&dq=data&hl=&cd=5&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=UT9dAAAAIAAJ&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/Exploratory_Data_Analysis.html?hl=&id=UT9dAAAAIAAJ\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"NO_PAGES\",\n" +
//            "    \"embeddable\": false,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": false\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": false\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=UT9dAAAAIAAJ&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"NONE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"Scratching down numbers (stem-and-leaf); Schematic summaries (pictures and numbers); Easy re-expression; Effective comparison (including well-chosen expresion); Plots of relationship; Straightening out plots (using three points); Smoothing ...\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"3TFWRjn1f-oC\",\n" +
//            "   \"etag\": \"gfA3pZhwNIE\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/3TFWRjn1f-oC\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"Analysis of Incomplete Multivariate Data\",\n" +
//            "    \"authors\": [\n" +
//            "     \"J.L. Schafer\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"CRC Press\",\n" +
//            "    \"publishedDate\": \"1997-08-01\",\n" +
//            "    \"description\": \"The last two decades have seen enormous developments in statistical methods for incomplete data. The EM algorithm and its extensions, multiple imputation, and Markov Chain Monte Carlo provide a set of flexible and reliable tools from inference in large classes of missing-data problems. Yet, in practical terms, those developments have had surprisingly little impact on the way most data analysts handle missing values on a routine basis. Analysis of Incomplete Multivariate Data helps bridge the gap between theory and practice, making these missing-data tools accessible to a broad audience. It presents a unified, Bayesian approach to the analysis of incomplete multivariate data, covering datasets in which the variables are continuous, categorical, or both. The focus is applied, where necessary, to help readers thoroughly understand the statistical properties of those methods, and the behavior of the accompanying algorithms. All techniques are illustrated with real data examples, with extended discussion and practical advice. All of the algorithms described in this book have been implemented by the author for general use in the statistical languages S and S Plus. The software is available free of charge on the Internet.\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"1439821860\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9781439821862\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": false,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 448,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Mathematics\"\n" +
//            "    ],\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": true,\n" +
//            "    \"contentVersion\": \"1.1.0.0.preview.1\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=3TFWRjn1f-oC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=3TFWRjn1f-oC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=3TFWRjn1f-oC&printsec=frontcover&dq=data&hl=&cd=6&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=3TFWRjn1f-oC&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/Analysis_of_Incomplete_Multivariate_Data.html?hl=&id=3TFWRjn1f-oC\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"PARTIAL\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": false\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": true,\n" +
//            "     \"acsTokenLink\": \"http://books.google.com/books/download/Analysis_of_Incomplete_Multivariate_Data-sample-pdf.acsm?id=3TFWRjn1f-oC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=3TFWRjn1f-oC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"All of the algorithms described in this book have been implemented by the author for general use in the statistical languages S and S Plus. The software is available free of charge on the Internet.\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"cmI0IQEN5wMC\",\n" +
//            "   \"etag\": \"iVsgNCguYZY\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/cmI0IQEN5wMC\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"The Little Data Book on Gender\",\n" +
//            "    \"subtitle\": \"2009\",\n" +
//            "    \"authors\": [\n" +
//            "     \"World Bank Publications\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"World Bank Publications\",\n" +
//            "    \"publishedDate\": \"2009-01-01\",\n" +
//            "    \"description\": \"This handy pocket guide is a quick reference for users interested in the gender statistics. The book presents gender-disaggregated data for more than 200 countries in an easy country-by-country reference on demography, education, health, labor force, political participation and the Millennium Development Goals. The book's summary pages cover regional and income group aggregates.\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9780821378731\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"0821378732\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": false,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 240,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Birth control\"\n" +
//            "    ],\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": false,\n" +
//            "    \"contentVersion\": \"preview-1.0.0\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=cmI0IQEN5wMC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=cmI0IQEN5wMC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=cmI0IQEN5wMC&printsec=frontcover&dq=data&hl=&cd=7&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=cmI0IQEN5wMC&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/The_Little_Data_Book_on_Gender.html?hl=&id=cmI0IQEN5wMC\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"ALL_PAGES\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": false\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": true\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=cmI0IQEN5wMC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"This handy pocket guide is a quick reference for users interested in the gender statistics.\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"-OQ2q5JqOdEC\",\n" +
//            "   \"etag\": \"JntdgvQ1bJE\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/-OQ2q5JqOdEC\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"What Is Data Science?\",\n" +
//            "    \"authors\": [\n" +
//            "     \"Mike Loukides\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"\\\"O'Reilly Media, Inc.\\\"\",\n" +
//            "    \"publishedDate\": \"2011-04-10\",\n" +
//            "    \"description\": \"We've all heard it: according to Hal Varian, statistics is the next sexy job. Five years ago, in What is Web 2.0, Tim O'Reilly said that \\\"data is the next Intel Inside.\\\" But what does that statement mean? Why do we suddenly care about statistics and about data? This report examines the many sides of data science -- the technologies, the companies and the unique skill sets.The web is full of \\\"data-driven apps.\\\" Almost any e-commerce application is a data-driven application. There's a database behind a web front end, and middleware that talks to a number of other databases and data services (credit card processing companies, banks, and so on). But merely using data isn't really what we mean by \\\"data science.\\\" A data application acquires its value from the data itself, and creates more data as a result. It's not just an application with data; it's a data product. Data science enables the creation of data products.\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9781449336097\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"1449336094\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": true,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 22,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Computers\"\n" +
//            "    ],\n" +
//            "    \"averageRating\": 4.5,\n" +
//            "    \"ratingsCount\": 2,\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": true,\n" +
//            "    \"contentVersion\": \"2.5.5.0.preview.3\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=-OQ2q5JqOdEC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=-OQ2q5JqOdEC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=-OQ2q5JqOdEC&printsec=frontcover&dq=data&hl=&cd=8&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=-OQ2q5JqOdEC&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/What_Is_Data_Science.html?hl=&id=-OQ2q5JqOdEC\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"PARTIAL\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": true\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": true\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=-OQ2q5JqOdEC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"&quot; A data application acquires its value from the data itself, and creates more data as a result. It&#39;s not just an application with data; it&#39;s a data product. Data science enables the creation of data products.\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"NgDks1hUjhMC\",\n" +
//            "   \"etag\": \"i2gyAAXFShE\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/NgDks1hUjhMC\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"Political Terrorism\",\n" +
//            "    \"subtitle\": \"A New Guide To Actors, Authors, Concepts, Data Bases, Theories, And Literature\",\n" +
//            "    \"authors\": [\n" +
//            "     \"Albert J. Jongman\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"Transaction Publishers\",\n" +
//            "    \"publishedDate\": \"1988\",\n" +
//            "    \"description\": \"While there is no easy way to define terrorism, it may generally be viewed as a method of violence in which civilians are targeted with the objective of forcing a perceived enemy into submission by creating fear, demoralization, and political friction in the population under attack. At one time a marginal field of study in the social sciences, terrorism is now very much in center stage. The 1970s terrorist attacks by the PLO, the Provisional Irish Republican Army, the Popular Front for the Liberation of Palestine, the Japanese Red Army, the Unabomber, Aum Shinrikyo, Timothy McVeigh, the World Trade Center attacks, the assault on a school in Russia, and suicide bombers have all made the term \\\"terrorism\\\" an all-too-common part of our vocabulary. This edition of Political Terrorism was originally published in the 1980s, well before some of the horrific events noted above. This monumental collection of definitions, conceptual frameworks, paradigmatic formulations, and bibliographic sources is being reissued in paperback now as a resource for the expanding community of researchers on the subject of terrorism. This is a carefully constructed guide to one of the most urgent issues of the world today. When the first edition was originally published, Choice noted, \\\"This extremely useful reference tool should be part of any serious social science collection.\\\" Chronicles of Culture called it \\\"a tremendously comprehensive book about a subject that any who have anything to lose--from property to liberty, life to limbs--should be forewarned against.\\\" Alex P. Schmid received his Ph.D. from the University of Zrich, Switzerland, and is a professor in the Department of Political Science at Leiden University. He is the coauthor, with Albert J. Jongman, of Soviet Military Interventions since 1945, available from Transaction. Albert J. Jongman is principal researcher for PIOOM, the Interdisciplinary Research Programme on Causes of Human Rights Violations, and has been a research assistant at the SIPRI in Sweden. He is the author of Monitoring Human Rights Violations (State Violence, State Terrorism, and Human Rights).Irving Louis Horowitz is Hannah Arendt Distinguished University Professor Emeritus of Sociology and Political Science at Rutgers University, and the chairman and editorial director of Transaction Publishers.\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"1412815665\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9781412815666\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": true,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 700,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Political Science\"\n" +
//            "    ],\n" +
//            "    \"averageRating\": 3.0,\n" +
//            "    \"ratingsCount\": 2,\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": true,\n" +
//            "    \"contentVersion\": \"0.0.3.0.preview.3\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=NgDks1hUjhMC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=NgDks1hUjhMC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=NgDks1hUjhMC&printsec=frontcover&dq=data&hl=&cd=9&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=NgDks1hUjhMC&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/Political_Terrorism.html?hl=&id=NgDks1hUjhMC\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"PARTIAL\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": true,\n" +
//            "     \"acsTokenLink\": \"http://books.google.com/books/download/Political_Terrorism-sample-epub.acsm?id=NgDks1hUjhMC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": true,\n" +
//            "     \"acsTokenLink\": \"http://books.google.com/books/download/Political_Terrorism-sample-pdf.acsm?id=NgDks1hUjhMC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=NgDks1hUjhMC&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"This edition of Political Terrorism was originally published in the 1980s, well before some of the horrific events noted above.\"\n" +
//            "   }\n" +
//            "  },\n" +
//            "  {\n" +
//            "   \"kind\": \"books#volume\",\n" +
//            "   \"id\": \"415loiMd_c0C\",\n" +
//            "   \"etag\": \"73uFhLjx6W4\",\n" +
//            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/415loiMd_c0C\",\n" +
//            "   \"volumeInfo\": {\n" +
//            "    \"title\": \"Data Streams\",\n" +
//            "    \"subtitle\": \"Algorithms and Applications\",\n" +
//            "    \"authors\": [\n" +
//            "     \"S. Muthukrishnan\"\n" +
//            "    ],\n" +
//            "    \"publisher\": \"Now Publishers Inc\",\n" +
//            "    \"publishedDate\": \"2005-01-01\",\n" +
//            "    \"description\": \"In the data stream scenario, input arrives very rapidly and there is limited memory to store the input. Algorithms have to work with one or few passes over the data, space less than linear in the input size or time significantly less than the input size. In the past few years, a new theory has emerged for reasoning about algorithms that work within these constraints on space, time, and number of passes. Some of the methods rely on metric embeddings, pseudo-random computations, sparse approximation theory and communication complexity. The applications for this scenario include IP network traffic analysis, mining text message streams and processing massive data sets in general. Researchers in Theoretical Computer Science, Databases, IP Networking and Computer Systems are working on the data stream challenges\",\n" +
//            "    \"industryIdentifiers\": [\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_10\",\n" +
//            "      \"identifier\": \"193301914X\"\n" +
//            "     },\n" +
//            "     {\n" +
//            "      \"type\": \"ISBN_13\",\n" +
//            "      \"identifier\": \"9781933019147\"\n" +
//            "     }\n" +
//            "    ],\n" +
//            "    \"readingModes\": {\n" +
//            "     \"text\": true,\n" +
//            "     \"image\": true\n" +
//            "    },\n" +
//            "    \"pageCount\": 126,\n" +
//            "    \"printType\": \"BOOK\",\n" +
//            "    \"categories\": [\n" +
//            "     \"Computers\"\n" +
//            "    ],\n" +
//            "    \"maturityRating\": \"NOT_MATURE\",\n" +
//            "    \"allowAnonLogging\": false,\n" +
//            "    \"contentVersion\": \"preview-1.0.0\",\n" +
//            "    \"imageLinks\": {\n" +
//            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=415loiMd_c0C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
//            "     \"thumbnail\": \"http://books.google.com/books/content?id=415loiMd_c0C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"language\": \"en\",\n" +
//            "    \"previewLink\": \"http://books.google.com/books?id=415loiMd_c0C&printsec=frontcover&dq=data&hl=&cd=10&source=gbs_api\",\n" +
//            "    \"infoLink\": \"http://books.google.com/books?id=415loiMd_c0C&dq=data&hl=&source=gbs_api\",\n" +
//            "    \"canonicalVolumeLink\": \"http://books.google.com/books/about/Data_Streams.html?hl=&id=415loiMd_c0C\"\n" +
//            "   },\n" +
//            "   \"saleInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
//            "    \"isEbook\": false\n" +
//            "   },\n" +
//            "   \"accessInfo\": {\n" +
//            "    \"country\": \"PK\",\n" +
//            "    \"viewability\": \"PARTIAL\",\n" +
//            "    \"embeddable\": true,\n" +
//            "    \"publicDomain\": false,\n" +
//            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
//            "    \"epub\": {\n" +
//            "     \"isAvailable\": true,\n" +
//            "     \"acsTokenLink\": \"http://books.google.com/books/download/Data_Streams-sample-epub.acsm?id=415loiMd_c0C&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
//            "    },\n" +
//            "    \"pdf\": {\n" +
//            "     \"isAvailable\": false\n" +
//            "    },\n" +
//            "    \"webReaderLink\": \"http://books.google.com/books/reader?id=415loiMd_c0C&hl=&printsec=frontcover&output=reader&source=gbs_api\",\n" +
//            "    \"accessViewStatus\": \"SAMPLE\",\n" +
//            "    \"quoteSharingAllowed\": false\n" +
//            "   },\n" +
//            "   \"searchInfo\": {\n" +
//            "    \"textSnippet\": \"The applications for this scenario include IP network traffic analysis, mining text message streams and processing massive data sets in general.\"\n" +
//            "   }\n" +
//            "  }\n" +
//            " ]\n" +
//            "}\n}";



    public QueryUtil(){

    }

    public static ArrayList<Book> extractBookDetail()
    {
        ArrayList<Book> books = new ArrayList<>();
        try {
            JSONObject baseJsonResponse = new JSONObject(BOOK_JSON_RESPONSE);
            JSONArray bookArray = baseJsonResponse.getJSONArray("items");
            int length = bookArray.length();
            for (int i = 0; i < length; i++) {
                String author = "Author: ";
                String category = "";
                String publisher = "Publisher: ";
                double rating;

                JSONObject bookObject = bookArray.getJSONObject(i);
                JSONObject bookInfo = bookObject.getJSONObject("volumeInfo");
                String title = bookInfo.getString("title");
                publisher += bookInfo.getString("publisher");
                if (bookInfo.isNull("averageRating")) {
                    // Default unrated value? Hmm...
                    rating = 5;
                } else {
                    rating = bookInfo.getDouble("averageRating");
                }

                JSONArray authors = bookInfo.getJSONArray("authors");

                /**
                 * Loop functions for the author(s) array
                 */
                if (authors.length() > 0) {
                    for (int j = 0; j < authors.length(); j++) {
                        author += authors.optString(j) + " ";
                    }
                }

                JSONArray categories = bookInfo.getJSONArray("categories");

                if (categories.length() > 0) {
                    for (int j = 0; j < categories.length(); j++) {
                        category += categories.optString(j) + " ";
                    }
                }

                Log.v(LOG_TAG, title + " " + author + " " + publisher + " " + rating + " " +
                        category + " ");
                Book book = new Book(rating, title, author, publisher, category);
                books.add(book);

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return books;
    }

}
