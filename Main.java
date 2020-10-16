package com.company;

import com.company.Classes.Id;
import com.company.Classes.User;
import com.company.Classes.UserRole;
public class Main {

    public static void main(String[] args) {
        UserRole mod = new UserRole(new Id<UserRole>(1),"moder");
        User user = new User(new Id<User>(1),"login","password", mod.getId());
        System.out.println(user.getId().getValue());
    }
}
        //<!ELEMENT Movie_Collection (movie)*>
        //                    <!ATTLIST movie moder CDATA #REQUIRED>
        //                    <!ELEMENT movie (name|release|country|genre|duration|poster|trailer|description|comment|person|moment|mistake)*>
        //                        <!ELEMENT name (#PCDATA)>
        //                        <!ELEMENT release (#PCDATA)>
        //                        <!ELEMENT country (#PCDATA)>
        //						  <!ELEMENT role (#PCDATA)>
        //                        <!ELEMENT genre (#PCDATA)>
        //                        <!ELEMENT duration (#PCDATA)>
        //                        <!ELEMENT poster (#PCDATA)>
        //                        <!ELEMENT trailer (#PCDATA)>
        //                        <!ELEMENT description (#PCDATA)>
        //                        <!ELEMENT comment (#PCDATA)>
        //                        <!ELEMENT person (#PCDATA)>
        //                        <!ELEMENT moment (#PCDATA)>
        //                        <!ELEMENT mistake (#PCDATA)>
        //                <!ELEMENT com.company.Classes.Historical_Figure (person)*>
        //                    <!ATTLIST person id CDATA #REQUIRED>
        //                    <!ELEMENT person (name|activity|birth|death|homeland|moment)*>
        //                        <!ELEMENT name (#PCDATA)>
        //                        <!ELEMENT activity (#PCDATA)>
        //                        <!ELEMENT birth (day|month|year)*>
        //                            <!ELEMENT day (#PCDATA)>
        //                            <!ELEMENT month (#PCDATA)>
        //                            <!ELEMENT year (#PCDATA)>
        //                        <!ELEMENT death (day|month|year)*>
        //                            <!ELEMENT day (#PCDATA)>
        //                            <!ELEMENT month (#PCDATA)>
        //                            <!ELEMENT year (#PCDATA)>
        //                        <!ELEMENT homeland (#PCDATA)>
        //                        <!ELEMENT moment (#PCDATA)>
        //                <!ELEMENT Historical_Moment (moment)*>
        //                        <!ATTLIST moment id CDATA #REQUIRED>
        //                        <!ELEMENT moment (name|date|description|person|country)*>
        //                        <!ELEMENT name (#PCDATA)>
        //                        <!ELEMENT date (day|month|year)*>
        //                            <!ELEMENT day (#PCDATA)>
        //                            <!ELEMENT month (#PCDATA)>
        //                            <!ELEMENT year (#PCDATA)>
        //                        <!ELEMENT description (#PCDATA)>
        //                        <!ELEMENT person (#PCDATA)>
        //                        <!ELEMENT country (#PCDATA)>
        //                <!ELEMENT Type_Of_Activity (activity)*>
        //                        <!ATTLIST activity id CDATA #REQUIRED>
        //                        <!ELEMENT activity (#PCDATA)>
        //                <!ELEMENT Genre (genre)*>
        //                        <!ATTLIST genre id CDATA #REQUIRED>
        //                        <!ELEMENT genre (#PCDATA)>
        //                <!ELEMENT Country (country)*>
        //                        <!ATTLIST country id CDATA #REQUIRED>
        //                        <!ELEMENT country (#PCDATA)>
        //				<!ELEMENT Roles (role)>
        //						<!ATTLIST role id CDATA #REQUIRED>
        //                        <!ELEMENT role (#PCDATA)>
        //                <!ELEMENT Users (user)*>
        //                        <!ATTLIST user role CDATA #REQUIRED>
        //                        <!ATTLIST user id CDATA #REQUIRED>
        //                        <!ELEMENT user (name|password)*>
        //                            <!ELEMENT name (#PCDATA)>
        //                            <!ELEMENT password (#PCDATA)>
        //                <!ELEMENT Comments (comment)*>
        //                    <!ATTLIST comment id CDATA #REQUIRED>
        //                    <!ELEMENT comment (rate|author|text|date)*>
        //                        <!ELEMENT rate (#PCDATA)>
        //                        <!ELEMENT author (#PCDATA)>
        //                        <!ELEMENT text (#PCDATA)>
        //                        <!ELEMENT date (day|month|year)*>
        //                            <!ELEMENT day (#PCDATA)>
        //                            <!ELEMENT month (#PCDATA)>
        //                            <!ELEMENT year (#PCDATA)>]>