/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

/**
 *
 * @author sharm
 */
public class OTPSender implements Sender {

    @Override
    public boolean send(String number, String data)throws Exception {
        
            Unirest.setTimeouts(0, 0);
            String mobNo=number.toString();
            int otp=Integer.parseInt(data);
            String url = "https://2factor.in/API/V1/924d2c74-ac39-11ed-813b-0200cd936042/SMS/+91"+mobNo+"/"+otp+"/OTP1";
            
//            "https://2factor.in/API/V1/924d2c74-ac39-11ed-813b-0200cd936042/SMS/+919301615731/AUTOGEN/OTP1"
            
            System.out.println("OTP is:"+otp);
            System.out.println("mon is:"+mobNo);
            GetRequest gr=Unirest.get(url);
            HttpResponse<String>response=gr.asString();
            String result=response.getBody();
            return result.contains("Success");
        }
    }
    
    

