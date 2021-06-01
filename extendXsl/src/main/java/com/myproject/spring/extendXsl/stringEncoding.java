package com.myproject.spring.extendXsl;
import java.util.HashMap;

public class stringEncoding {
	
	 
	 
	    private static final HashMap<Character, String> htmlEncodeChars = new HashMap<>();
	     
	    static
	    {
	         
	        // Special characters for HTML
	        htmlEncodeChars.put('\u0026', "&amp;");
	        htmlEncodeChars.put('\u003C', "&lt;");
	        htmlEncodeChars.put('\u003E', "&gt;");
	        htmlEncodeChars.put('\u0022', "&quot;");
	         
	        htmlEncodeChars.put('\u0152', "&#x152;");
	        htmlEncodeChars.put('\u0153', "&#x153;");
	        htmlEncodeChars.put('\u0160', "&#x160;");
	        htmlEncodeChars.put('\u0161', "&#x161;");
	        htmlEncodeChars.put('\u0178', "&#x178;");
	        htmlEncodeChars.put('\u02C6', "&#x2C6;");
	        htmlEncodeChars.put('\u02DC', "&#x2DC;");
	        htmlEncodeChars.put('\u2002', "&#x2002;");
	        htmlEncodeChars.put('\u2003', "&#x2003;");
	        htmlEncodeChars.put('\u2009', "&#x2009;");
	        htmlEncodeChars.put('\u200C', "&#x200C;");
	        htmlEncodeChars.put('\u200D', "&#x200D;");
	        htmlEncodeChars.put('\u200E', "&#x200E;");
	        htmlEncodeChars.put('\u200F', "&#x200F;");
	        htmlEncodeChars.put('\u2013', "&#x2013;");
	        htmlEncodeChars.put('\u2014', "&#x2014;");
	        htmlEncodeChars.put('\u2018', "&#x2018;");
	        htmlEncodeChars.put('\u2019', "&#x2019;");
	        htmlEncodeChars.put('\u201A', "&#x201A;");
	        htmlEncodeChars.put('\u201C', "&#x201C;");
	        htmlEncodeChars.put('\u201D', "&#x201D;");
	        htmlEncodeChars.put('\u201E', "&#x201E;");
	        htmlEncodeChars.put('\u2020', "&#x2020;;");
	        htmlEncodeChars.put('\u2021', "&#x2021;");
	        htmlEncodeChars.put('\u2030', "&#x2030;;");
	        htmlEncodeChars.put('\u2039', "&#x2039;");
	        htmlEncodeChars.put('\u203A', "&#x203A;");
	        htmlEncodeChars.put('\u20AC', "&#x20AC;");
	         
	        // Character entity references for ISO 8859-1 characters
	        htmlEncodeChars.put('\u00A0', "&#x00A0;");
	        htmlEncodeChars.put('\u00A1', "&#x00A1;");
	        htmlEncodeChars.put('\u00A2', "&#x00A2;");
	        htmlEncodeChars.put('\u00A3', "&#x00A3;");
	        htmlEncodeChars.put('\u00A4', "&#x00A4;");
	        htmlEncodeChars.put('\u00A5', "&#x00A5;");
	        htmlEncodeChars.put('\u00A6', "&#x00A6;");
	        htmlEncodeChars.put('\u00A7', "&#x00A7;");
	        htmlEncodeChars.put('\u00A8', "&#x00A8;");
	        htmlEncodeChars.put('\u00A9', "&#x00A9;");
	        htmlEncodeChars.put('\u00AA', "&#x00AA;");
	        htmlEncodeChars.put('\u00AB', "&#x00AB;");
	        htmlEncodeChars.put('\u00AC', "&#x00AC;");
	        htmlEncodeChars.put('\u00AD', "&#x00AD;");
	        htmlEncodeChars.put('\u00AE', "&#x00AE;");
	        htmlEncodeChars.put('\u00AF', "&#x00AF;");
	        htmlEncodeChars.put('\u00B0', "&#x00B0;");
	        htmlEncodeChars.put('\u00B1', "&#x00B1;");
	        htmlEncodeChars.put('\u00B2', "&#x00B2;");
	        htmlEncodeChars.put('\u00B3', "&#x00B3;");
	        htmlEncodeChars.put('\u00B4', "&#x00B4;");
	        htmlEncodeChars.put('\u00B5', "&#x00B5;");
	        htmlEncodeChars.put('\u00B6', "&#x00B6;");
	        htmlEncodeChars.put('\u00B7', "&#x00B7;");
	        htmlEncodeChars.put('\u00B8', "&#x00B8;");
	        htmlEncodeChars.put('\u00B9', "&#x00B9;");
	        htmlEncodeChars.put('\u00BA', "&#x00BA;");
	        htmlEncodeChars.put('\u00BB', "&#x00BB;");
	        htmlEncodeChars.put('\u00BC', "&#x00BC;");
	        htmlEncodeChars.put('\u00BD', "&#x00BD;");
	        htmlEncodeChars.put('\u00BE', "&#x00BE;");
	        htmlEncodeChars.put('\u00BF', "&#x00BF;");
	        htmlEncodeChars.put('\u00C0', "&#x00C0;");
	        htmlEncodeChars.put('\u00C1', "&#x00C1;");
	        htmlEncodeChars.put('\u00C2', "&#x00C2;");
	        htmlEncodeChars.put('\u00C3', "&#x00C3;");
	        htmlEncodeChars.put('\u00C4', "&#x00C4;");
	        htmlEncodeChars.put('\u00C5', "&#x00C5;");
	        htmlEncodeChars.put('\u00C6', "&#x00C6;");
	        htmlEncodeChars.put('\u00C7', "&#x00C7;");
	        htmlEncodeChars.put('\u00C8', "&#x00C8;");
	        htmlEncodeChars.put('\u00C9', "&#x00C9;");
	        htmlEncodeChars.put('\u00CA', "&#x00CA;");
	        htmlEncodeChars.put('\u00CB', "&#x00CB;");
	        htmlEncodeChars.put('\u00CC', "&#x00CC;");
	        htmlEncodeChars.put('\u00CD', "&#x00CD;");
	        htmlEncodeChars.put('\u00CE', "&#x00CE;");
	        htmlEncodeChars.put('\u00CF', "&#x00CF;");
	        htmlEncodeChars.put('\u00D0', "&#x00D0;");
	        htmlEncodeChars.put('\u00D1', "&#x00D1;");
	        htmlEncodeChars.put('\u00D2', "&#x00D2;");
	        htmlEncodeChars.put('\u00D3', "&#x00D3;");
	        htmlEncodeChars.put('\u00D4', "&#x00D4;");
	        htmlEncodeChars.put('\u00D5', "&#x00D5;");
	        htmlEncodeChars.put('\u00D6', "&#x00D6;");
	        htmlEncodeChars.put('\u00D7', "&#x00D7;");
	        htmlEncodeChars.put('\u00D8', "&#x00D8;");
	        htmlEncodeChars.put('\u00D9', "&#x00D9;");
	        htmlEncodeChars.put('\u00DA', "&#x00DA;");
	        htmlEncodeChars.put('\u00DB', "&#x00DB;");
	        htmlEncodeChars.put('\u00DC', "&#x00DC;");
	        htmlEncodeChars.put('\u00DD', "&#x00DD;");
	        htmlEncodeChars.put('\u00DE', "&#x00DE;");
	        htmlEncodeChars.put('\u00DF', "&#x00DF;");
	        htmlEncodeChars.put('\u00E0', "&#x00E0;");
	        htmlEncodeChars.put('\u00E1', "&#x00E1;");
	        htmlEncodeChars.put('\u00E2', "&#x00E2;");
	        htmlEncodeChars.put('\u00E3', "&#x00E3;");
	        htmlEncodeChars.put('\u00E4', "&#x00E4;");
	        htmlEncodeChars.put('\u00E5', "&#x00E5;");
	        htmlEncodeChars.put('\u00E6', "&#x00E6;");
	        htmlEncodeChars.put('\u00E7', "&#x00E7;");
	        htmlEncodeChars.put('\u00E8', "&#x00E8;");
	        htmlEncodeChars.put('\u00E9', "&#x00E9;");
	        htmlEncodeChars.put('\u00EA', "&#x00EA;");
	        htmlEncodeChars.put('\u00EB', "&#x00EB;");
	        htmlEncodeChars.put('\u00EC', "&#x00EC;");
	        htmlEncodeChars.put('\u00ED', "&#x00ED;");
	        htmlEncodeChars.put('\u00EE', "&#x00EE;");
	        htmlEncodeChars.put('\u00EF', "&#x00EF;");
	        htmlEncodeChars.put('\u00F0', "&#x00F0;");
	        htmlEncodeChars.put('\u00F1', "&#x00F1;");
	        htmlEncodeChars.put('\u00F2', "&#x00F2;");
	        htmlEncodeChars.put('\u00F3', "&#x00F3;");
	        htmlEncodeChars.put('\u00F4', "&#x00F4;");
	        htmlEncodeChars.put('\u00F5', "&#x00F5;");
	        htmlEncodeChars.put('\u00F6', "&#x00F6;");
	        htmlEncodeChars.put('\u00F7', "&#x00F7;");
	        htmlEncodeChars.put('\u00F8', "&#x00F8;");
	        htmlEncodeChars.put('\u00F9', "&#x00F9;");
	        htmlEncodeChars.put('\u00FA', "&#x00FA;");
	        htmlEncodeChars.put('\u00FB', "&#x00FB;");
	        htmlEncodeChars.put('\u00FC', "&#x00FC;");
	        htmlEncodeChars.put('\u00FD', "&#x00FD;");
	        htmlEncodeChars.put('\u00FE', "&#x00FE;");
	        htmlEncodeChars.put('\u00FF', "&#x00FF;");
	         
	        // Mathematical, Greek and Symbolic characters for HTML
	        htmlEncodeChars.put('\u0192', "&#x0192;");
	        htmlEncodeChars.put('\u0391', "&#x0391;");
	        htmlEncodeChars.put('\u0392', "&#x0392;");
	        htmlEncodeChars.put('\u0393', "&#x0393;");
	        htmlEncodeChars.put('\u0394', "&#x0394;");
	        htmlEncodeChars.put('\u0395', "&#x0395;");
	        htmlEncodeChars.put('\u0396', "&#x0396;");
	        htmlEncodeChars.put('\u0397', "&#x0397;");
	        htmlEncodeChars.put('\u0398', "&#x0398;");
	        htmlEncodeChars.put('\u0399', "&#x0399;");
	        htmlEncodeChars.put('\u039A', "&#x039A;");
	        htmlEncodeChars.put('\u039B', "&#x039B;");
	        htmlEncodeChars.put('\u039C', "&#x039C;");
	        htmlEncodeChars.put('\u039D', "&#x039D;");
	        htmlEncodeChars.put('\u039E', "&#x039E;");
	        htmlEncodeChars.put('\u039F', "&#x039F;");
	        htmlEncodeChars.put('\u03A0', "&#x03A0;");
	        htmlEncodeChars.put('\u03A1', "&#x03A1;");
	        htmlEncodeChars.put('\u03A3', "&#x03A3;");
	        htmlEncodeChars.put('\u03A4', "&#x03A4;");
	        htmlEncodeChars.put('\u03A5', "&#x03A5;");
	        htmlEncodeChars.put('\u03A6', "&#x03A6;");
	        htmlEncodeChars.put('\u03A7', "&#x03A7;");
	        htmlEncodeChars.put('\u03A8', "&#x03A8;");
	        htmlEncodeChars.put('\u03A9', "&#x03A9;");
	        htmlEncodeChars.put('\u03B1', "&#x03B1;");
	        htmlEncodeChars.put('\u03B2', "&#x03B2;");
	        htmlEncodeChars.put('\u03B3', "&#x03B3;");
	        htmlEncodeChars.put('\u03B4', "&#x03B4;");
	        htmlEncodeChars.put('\u03B5', "&#x03B5;");
	        htmlEncodeChars.put('\u03B6', "&#x03B6;");
	        htmlEncodeChars.put('\u03B7', "&#x03B7;");
	        htmlEncodeChars.put('\u03B8', "&#x03B8;");
	        htmlEncodeChars.put('\u03B9', "&#x03B9;");
	        htmlEncodeChars.put('\u03BA', "&#x03BA;");
	        htmlEncodeChars.put('\u03BB', "&#x03BB;");
	        htmlEncodeChars.put('\u03BC', "&#x03BC;");
	        htmlEncodeChars.put('\u03BD', "&#x03BD;");
	        htmlEncodeChars.put('\u03BE', "&#x03BE;");
	        htmlEncodeChars.put('\u03BF', "&#x03BF;");
	        htmlEncodeChars.put('\u03C0', "&#x03C0;");
	        htmlEncodeChars.put('\u03C1', "&#x03C1;");
	        htmlEncodeChars.put('\u03C2', "&#x03C2;");
	        htmlEncodeChars.put('\u03C3', "&#x03C3;");
	        htmlEncodeChars.put('\u03C4', "&#x03C4;");
	        htmlEncodeChars.put('\u03C5', "&#x03C5;");
	        htmlEncodeChars.put('\u03C6', "&#x03C6;");
	        htmlEncodeChars.put('\u03C7', "&#x03C7;");
	        htmlEncodeChars.put('\u03C8', "&#x03C8;");
	        htmlEncodeChars.put('\u03C9', "&#x03C9;");
	        htmlEncodeChars.put('\u03D1', "&#x03D1;");
	        htmlEncodeChars.put('\u03D2', "&#x03D2;");
	        htmlEncodeChars.put('\u03D6', "&#x03D6;");
	        htmlEncodeChars.put('\u2022', "&#x2022;");
	        htmlEncodeChars.put('\u2026', "&#x2026;");
	        htmlEncodeChars.put('\u2032', "&#x2032;");
	        htmlEncodeChars.put('\u2033', "&#x2023;");
	        htmlEncodeChars.put('\u203E', "&#x202E;");
	        htmlEncodeChars.put('\u2044', "&#x2044;");
	        htmlEncodeChars.put('\u2118', "&#x2118;");
	        htmlEncodeChars.put('\u2111', "&#x2111;");
	        htmlEncodeChars.put('\u211C', "&#x211C;");
	        htmlEncodeChars.put('\u2122', "&#x2122;");
	        htmlEncodeChars.put('\u2135', "&#x2135;");
	        htmlEncodeChars.put('\u2190', "&#x2190;");
	        htmlEncodeChars.put('\u2191', "&#x2191;");
	        htmlEncodeChars.put('\u2192', "&#x2192;");
	        htmlEncodeChars.put('\u2193', "&#x2193;");
	        htmlEncodeChars.put('\u2194', "&#x2194;");
	        htmlEncodeChars.put('\u21B5', "&#x21B5;");
	        htmlEncodeChars.put('\u21D0', "&#x21D0;");
	        htmlEncodeChars.put('\u21D1', "&#x21D1;");
	        htmlEncodeChars.put('\u21D2', "&#x21D2;");
	        htmlEncodeChars.put('\u21D3', "&#x21D3;");
	        htmlEncodeChars.put('\u21D4', "&#x21D4;");
	        htmlEncodeChars.put('\u2200', "&#x2200;");
	        htmlEncodeChars.put('\u2202', "&#x2202;");
	        htmlEncodeChars.put('\u2203', "&#x2203;");
	        htmlEncodeChars.put('\u2205', "&#x2205;");
	        htmlEncodeChars.put('\u2207', "&#x2207;");
	        htmlEncodeChars.put('\u2208', "&#x2208;");
	        htmlEncodeChars.put('\u2209', "&#x2209;");
	        htmlEncodeChars.put('\u220B', "&#x220B;");
	        htmlEncodeChars.put('\u220F', "&#x220F;");
	        htmlEncodeChars.put('\u2211', "&#x2211;");
	        htmlEncodeChars.put('\u2212', "&#x2212;");
	        htmlEncodeChars.put('\u2217', "&#x2217;");
	        htmlEncodeChars.put('\u221A', "&#x221A;");
	        htmlEncodeChars.put('\u221D', "&#x221D;");
	        htmlEncodeChars.put('\u221E', "&#x221E;");
	        htmlEncodeChars.put('\u2220', "&#x2220;");
	        htmlEncodeChars.put('\u2227', "&#x2227;");
	        htmlEncodeChars.put('\u2228', "&#x2228;");
	        htmlEncodeChars.put('\u2229', "&#x2229;");
	        htmlEncodeChars.put('\u222A', "&#x222A;");
	        htmlEncodeChars.put('\u222B', "&#x222B;");
	        htmlEncodeChars.put('\u2234', "&#x2234;");
	        htmlEncodeChars.put('\u223C', "&#x223C;");
	        htmlEncodeChars.put('\u2245', "&#x2245;");
	        htmlEncodeChars.put('\u2248', "&#x2248;");
	        htmlEncodeChars.put('\u2260', "&#x2260;");
	        htmlEncodeChars.put('\u2261', "&#x2261;");
	        htmlEncodeChars.put('\u2264', "&#x2264;");
	        htmlEncodeChars.put('\u2265', "&#x2265;");
	        htmlEncodeChars.put('\u2282', "&#x2282;");
	        htmlEncodeChars.put('\u2283', "&#x2283;");
	        htmlEncodeChars.put('\u2284', "&#x2284;");
	        htmlEncodeChars.put('\u2286', "&#x2286;");
	        htmlEncodeChars.put('\u2287', "&#x2287;");
	        htmlEncodeChars.put('\u2295', "&#x2295;");
	        htmlEncodeChars.put('\u2297', "&#x2297;");
	        htmlEncodeChars.put('\u22A5', "&#x22A5;");
	        htmlEncodeChars.put('\u22C5', "&#x22C5;");
	        htmlEncodeChars.put('\u2308', "&#x2308;");
	        htmlEncodeChars.put('\u2309', "&#x2309;");
	        htmlEncodeChars.put('\u230A', "&#x230A;");
	        htmlEncodeChars.put('\u230B', "&#x230B;");
	        htmlEncodeChars.put('\u2329', "&#x2329;");
	        htmlEncodeChars.put('\u232A', "&#x232A;");
	        htmlEncodeChars.put('\u25CA', "&#x25CA;");
	        htmlEncodeChars.put('\u2660', "&#x2660;");
	        htmlEncodeChars.put('\u2663', "&#x2663;");
	        htmlEncodeChars.put('\u2665', "&#x2665;");
	        htmlEncodeChars.put('\u2666', "&#x2666;");
	    }
	     
	    private stringEncoding()
	    {
	    }
	     
	    public static String encodeHtml(String source)
	    {
	        return encode(source, htmlEncodeChars);
	    }
	     
	     
	    private static String encode(String source, HashMap<Character, String> encodingTable)
	    {
	        if (null == source)
	        {
	            return null;
	        }
	         
	        if (null == encodingTable)
	        {
	            return source;
	        }
	         
	        StringBuffer    encoded_string = null;
	        char[]          string_to_encode_array = source.toCharArray();
	        int             last_match = -1;
	        int             difference = 0;
	         
	        for (int i = 0; i < string_to_encode_array.length; i++)
	        {
	            char char_to_encode = string_to_encode_array[i];
	             
	            if (encodingTable.containsKey(char_to_encode))
	            {
	                if (null == encoded_string)
	                {
	                    encoded_string = new StringBuffer(source.length());
	                }
	                difference = i - (last_match + 1);
	                if (difference > 0)
	                {
	                    encoded_string.append(string_to_encode_array, last_match + 1, difference);
	                }
	                encoded_string.append(encodingTable.get(char_to_encode));
	                last_match = i;
	            }
	        }
	         
	        if (null == encoded_string)
	        {
	            return source;
	        }
	        else
	        {
	            difference = string_to_encode_array.length - (last_match + 1);
	            if (difference > 0)
	            {
	                encoded_string.append(string_to_encode_array, last_match + 1, difference);
	            }
	            return encoded_string.toString();
	        }
	    }
	}


