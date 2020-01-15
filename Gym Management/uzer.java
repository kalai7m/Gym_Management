/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggym;

/**
 *
 * @author Kalaivani
 */
class uzer {
    String name,dob,gender,scheme;
    int amt;
    public uzer(String a,String b,String c,String d,int e)
    {
        name=a;
        dob=b;
        gender=c;
        scheme=d;
        amt=e;
    }
    public String getname()
    {
        return name;
    }
    public String getdob()
    {
        return dob;
    }
    public String getgender()
    {
        return gender;
    }
    public String getscheme()
    {
        return scheme;
    }
    public int getamt()
    {
        return amt;
    }
}
