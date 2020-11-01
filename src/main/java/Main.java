import WidgetJson.FormBase;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class Main {
    /*public String format(String unformattedXml) {
        try {
            final Document document = parseXmlFile(unformattedXml);

            OutputFormat format = new OutputFormat(document);
            format.setLineWidth(65);
            format.setIndenting(true);
            format.setIndent(2);
            Writer out = new StringWriter();
            XMLSerializer serializer = new XMLSerializer(out, format);
            serializer.serialize(document);

            return out.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Document parseXmlFile(String in) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(in));
            return db.parse(is);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/


    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            JSONObject xmlJSONObj = XML.toJSONObject(getXmlString());
            FormBase pojo = objectMapper.readValue(xmlJSONObj.toString(), FormBase.class);
            System.out.println(pojo.toString());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    private static String getXmlString() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><form xmlns=\"http://www.itorbit.net/goofy/v2/form-definition\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "\t   \t\t\tname=\"FacilityProfitForm\"\n" +
                "\t   \t\t\tclient-side-language=\"skippy\"\n" +
                "\t   \t\t\ttitle=\"FacilityProfitForm\" \t   \t\t\t\n" +
                "\t   \t\t\tvisible=\"false\" \t   \t\t\tlayoutable=\"true\" \t   \t\t\tenabled=\"true\" \t   \t\t\trendered=\"true\" \t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\tresizable=\"false\" \t   \t\t\tdraggable=\"true\" \t   \t\t\t\n" +
                "\t   \t\t\tversion=\"0\" \n" +
                "\t   \t\t\t><resources><glossary name=\"TejaratBank-V2\"/></resources><layout><grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"1\" margin-width=\"0\" margin-height=\"0\" horizontal-spacing=\"0\" vertical-spacing=\"0\"\n" +
                "\t   \t\t/></layout><children><composite\n" +
                "\t\t\n" +
                " name= \"CMP_facilityProfit\" \t\t enabled= \"true\" \t\t\t\n" +
                "\t\t><layout><grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"4\" margin-width=\"5\" margin-height=\"5\" horizontal-spacing=\"5\" vertical-spacing=\"5\"\n" +
                "\t   \t\t/></layout><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"false\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"fill\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data><children><label \n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"LBL_facilityProfitSubject\" \t\t enabled= \"true\" \t\t label= \"Lable.facilityProfitSubject\" \t\n" +
                "\t\t><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"false\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"end\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data></label><textfield\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"false\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"20\" \t\t\t\n" +
                "\t\t\n" +
                "\t\tdirection= \"rtl\" \t\t\t\n" +
                "\t\tformatNumber= \"false\"\n" +
                "\t\t\n" +
                " name= \"TXT_facilityProfitSubject\" \t\t enabled= \"true\" \t\t label= \"TextField.facilityProfitSubject\" \t\n" +
                "\t\t><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"false\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"begin\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data><validators></validators><events></events></textfield><label \n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"LBL_facilityProfitPercent\" \t\t enabled= \"true\" \t\t label= \"Lable.facilityProfitPercent\" \t\n" +
                "\t\t><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"false\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"end\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data></label><textfield\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"false\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"20\" \t\t\t\n" +
                "\t\t\n" +
                "\t\tdirection= \"rtl\" \t\t\t\n" +
                "\t\tformatNumber= \"false\"\n" +
                "\t\t\n" +
                " name= \"TXT_facilityProfitPercent\" \t\t enabled= \"true\" \t\t label= \"TextField.facilityProfitPercent\" \t\n" +
                "\t\t><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"false\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"begin\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data><validators></validators><events></events></textfield><label \n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"LBL_facilityProfitComment\" \t\t enabled= \"true\" \t\t label= \"Lable.facilityProfitComment\" \t\n" +
                "\t\t><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"false\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"end\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data></label><textfield\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"false\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"20\" \t\t\t\n" +
                "\t\t\n" +
                "\t\tdirection= \"rtl\" \t\t\t\n" +
                "\t\tformatNumber= \"false\"\n" +
                "\t\t\n" +
                " name= \"TXT_facilityProfitComment\" \t\t enabled= \"true\" \t\t label= \"TextField.facilityProfitComment\" \t\n" +
                "\t\t><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"false\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"begin\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data><validators></validators><events></events></textfield></children></composite><composite\n" +
                "\t\t\n" +
                " name= \"CMP_facilityProfitExportOrRefuse\" \t\t enabled= \"true\" \t\t\t\n" +
                "\t\t><layout><grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"4\" margin-width=\"0\" margin-height=\"0\" horizontal-spacing=\"5\" vertical-spacing=\"0\"\n" +
                "\t   \t\t/></layout><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"false\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"fill\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data><children><button\n" +
                "\t\t action= \"none\"  \n" +
                "\t\t\n" +
                "\t\t caption= \"Button.facilityProfitFinalExport\" \n" +
                "\t\t\n" +
                "\t\t icon-width= \"0\"\n" +
                "\t\t icon-height= \"0\"\n" +
                "\t\t\n" +
                " name= \"BTN_Button.facilityProfitFinalExport\" \t\t enabled= \"true\" \t\t label= \"Button.facilityProfitFinalExport\" \t\n" +
                "\t\t><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"2\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"true\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"end\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data><events></events></button><button\n" +
                "\t\t action= \"close\"  \n" +
                "\t\t\n" +
                "\t\t caption= \"Button.facilityProfitFinalRefus\" \n" +
                "\t\t\n" +
                "\t\t icon-width= \"0\"\n" +
                "\t\t icon-height= \"0\"\n" +
                "\t\t\n" +
                " name= \"BTN_facilityProfitFinalRefus\" \t\t enabled= \"true\" \t\t label= \"Button.facilityProfitFinalRefus\" \t\n" +
                "\t\t><layout-data><grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"2\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"false\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"true\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"begin\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/></layout-data><events></events></button></children></composite></children></form>\n" +
                "\t   \t";
    }
}


