package com.myproject.spring.extendXsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( args[1] + " Test!" );
    	//ApplicationContext context = SpringApplication.run(App.class, args);
    	//testClass test = context.getBean(testClass.class);
    	//MLApiClient client = context.getBean(MLApiClient.class);
    	//System.out.println(testClass.post_badBibData("Centers for Disease Control &amp; Prevention. Viral Hepatitis-Hepatitis C Information [Internet]. 2016. Available from: http://www.cdc.gov/hepatitis/hcv/hcvfaq.htm. Cited 9 Jun 2016."));
    	//System.out.println(testClass.postHttpClient());
    	
    	//System.out.println(testClass.testMe(10, 20));
    	//System.out.println(testClass.getClassName());
    	
    	//System.out.println(MLApiClient.post_badNoteData("Chair of Econophysics &amp; Complex Systems, Ecole polytechnique, 91128 Palaiseau Cedex, France"));
    	
    	String ApiOutput = MLApiClient.post_badNoteData("Institut de Recherche en Mathématique et Physique, Université catholique de Louvain, Louvain-la-Neuve, B-1348, Belgium");
    	System.out.println(ApiOutput);
    	//System.out.println("===================");
    	//System.out.println(MLApiClient.EntityResolver(ApiOutput));
    	
    	//System.out.println("===================");
    	//System.out.println("===================");
    	
    	//ApiOutput = MLApiClient.post_badNoteData("Instituto de Ciencias Físicas, Universidad Nacional Autónoma de México, Cuernavaca 62210, México");
    	//System.out.println(ApiOutput);
    	
    	//ApiOutput = MLApiClient.post_badNoteData("Instituto de Física, Benemérita Universidad Autónoma de Puebla, Apartado Postal J-48, 72570 Puebla, México");
    	//System.out.println(ApiOutput);
    	
    	//ApiOutput = MLApiClient.post_badNoteData("Instituto de Ciencias Físicas, Universidad Nacional Autónoma de México, Cuernavaca 62210, México and Centro Internacional de Ciencias, Cuernavaca 62210, México");
    	//System.out.println(ApiOutput);
    	
    	ApiOutput = MLApiClient.post_badNoteData("Centro de Astrobiología (CSIC-INTA), Ctra. de Ajalvir, Km 4, E-28850, Torrejón de Ardoz, Madrid, Spain");
    	System.out.println(ApiOutput);
    	
    	ApiOutput = MLApiClient.post_badNoteData("Instituto de Ciencias Físicas, Universidad Nacional Autónoma de México, Cuernavaca 62210, México and Centro Internacional de Ciencias, Cuernavaca 62210, México");
    	System.out.println(ApiOutput);
    }
}
