
import Base.Form;
import WidgetJson.FormBase;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.json.JSONObject;
import org.json.XML;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            JSONObject xmlJSONObj = XML.toJSONObject(getXmlString());
/*
            FormBase pojo = objectMapper.readValue(xmlJSONObj.toString(), FormBase.class);
*/
            System.out.println(objectMapper.readValue(xmlJSONObj.toString(),FormBase.class));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\t   \t\t\t<form xmlns=\"http://www.itorbit.net/goofy/v2/form-definition\"\n" +
                "\t\t\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "\t   \t\t\tname=\"IncludedDocumentForm\"\n" +
                "\t   \t\t\tclient-side-language=\"skippy\"\n" +
                "\t   \t\t\ttitle=\"IncludedDocumentForm\" \t   \t\t\t\n" +
                "\t   \t\t\tvisible=\"false\" \t   \t\t\tlayoutable=\"true\" \t   \t\t\tenabled=\"true\" \t   \t\t\trendered=\"true\" \t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\tresizable=\"false\" \t   \t\t\tdraggable=\"true\" \t   \t\t\t\n" +
                "\t   \t\t\tversion=\"0\" \n" +
                "\t   \t\t\t>\n" +
                "\n" +
                "\t\t\t\t<resources>\n" +
                "\t\t\t\t\t<glossary name=\"TejaratBank-V2\"/>\n" +
                "\t\t\t\t</resources>\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t   \t\t\t<events>\n" +
                "\t   \t\t\t\n" +
                "\t   \t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_63774\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t   \t\t\t\n" +
                "\t   \t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_63775\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t   \t\t\t\n" +
                "\t   \t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_63776\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t   \t\t\t\n" +
                "\t   \t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_63777\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t   \t\t\t\n" +
                "\t   \t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_63778\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t   \t\t\t\n" +
                "\t   \t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_63779\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t   \t\t\t\n" +
                "\t   \t\t\t</events>\n" +
                "\t   \t\t\t\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t<layout>\n" +
                "\t   \t\t<grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"1\" margin-width=\"0\" margin-height=\"0\" horizontal-spacing=\"0\" vertical-spacing=\"0\"\n" +
                "\t   \t\t/>\n" +
                "\t</layout>\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<children>\n" +
                "\t\t\t  \t\n" +
                "\t\t\t\t\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t<composite\n" +
                "\t\t\n" +
                " name= \"CMP_SupleDoc\" \t\t enabled= \"true\" \t\t\t\n" +
                "\t\t>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t<layout>\n" +
                "\t   \t\t<grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"1\" margin-width=\"0\" margin-height=\"5\" horizontal-spacing=\"5\" vertical-spacing=\"5\"\n" +
                "\t   \t\t/>\n" +
                "\t</layout>\n" +
                "\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\tv-alignment=\"fill\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"fill\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t<children>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t<composite\n" +
                "\t\t\n" +
                " name= \"CMP.supleDocSubject\" \t\t enabled= \"true\" \t\t\t\n" +
                "\t\t>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t<layout>\n" +
                "\t   \t\t<grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"6\" margin-width=\"0\" margin-height=\"5\" horizontal-spacing=\"5\" vertical-spacing=\"5\"\n" +
                "\t   \t\t/>\n" +
                "\t</layout>\n" +
                "\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\tv-alignment=\"fill\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"fill\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t<children>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<label \n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"LBL_supleDocSub\" \t\t enabled= \"true\" \t\t label= \"Label.supleDocSub\" \t\n" +
                "\t\t>\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t</label>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t<textfield\n" +
                "\t\t\n" +
                "\t\t\tvalue= \"#{IncDocLoanSub}\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"50\" \t\t\t\n" +
                "\t\t\n" +
                "\t\tdirection= \"rtl\" \t\t\t\n" +
                "\t\tformatNumber= \"false\"\n" +
                "\t\t\n" +
                " name= \"TXTsupleDocSub\" \t\t enabled= \"true\" \t\t label= \"TextField.supleDocSub\" \t\n" +
                "\t\t>\n" +
                "\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\t\n" +
                "\t\t\t\th-hint=\"170\"\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t</textfield>\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<label \n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"LBL_suplementDocumentCase\" \t\t enabled= \"true\" \t\t label= \"Label.suplementDocumentCase\" \t\n" +
                "\t\t>\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t</label>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t<textfield\n" +
                "\t\t\n" +
                "\t\t\tvalue= \"#{IncDocLoanCase}\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"50\" \t\t\t\n" +
                "\t\t\n" +
                "\t\tdirection= \"rtl\" \t\t\t\n" +
                "\t\tformatNumber= \"false\"\n" +
                "\t\t\n" +
                " name= \"TXTsuplementDocumentCase\" \t\t enabled= \"true\" \t\t label= \"TextField_suplementDocumentCase\" \t\n" +
                "\t\t>\n" +
                "\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\t\n" +
                "\t\t\t\th-hint=\"170\"\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t</textfield>\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<label \n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"LBL_supleDocYear\" \t\t enabled= \"true\" \t\t label= \"Label.supleDocYear\" \t\n" +
                "\t\t>\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t</label>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t<textfield\n" +
                "\t\t\n" +
                "\t\t\tvalue= \"#{IncDocYear}\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"20\" \t\t\t\n" +
                "\t\t\n" +
                "\t\tdirection= \"rtl\" \t\t\t\n" +
                "\t\tformatNumber= \"false\"\n" +
                "\t\t\n" +
                " name= \"TXTsupleDocYear\" \t\t enabled= \"true\" \t\t label= \"TextField.supleDocYear\" \t\n" +
                "\t\t>\n" +
                "\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t</textfield>\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t</children>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t</composite>\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t<composite\n" +
                "\t\t\n" +
                " name= \"CMPIncludeDocList\" \t\t enabled= \"true\" \t\t\t\n" +
                "\t\t>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t<layout>\n" +
                "\t   \t\t<grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"1\" margin-width=\"0\" margin-height=\"5\" horizontal-spacing=\"5\" vertical-spacing=\"5\"\n" +
                "\t   \t\t/>\n" +
                "\t</layout>\n" +
                "\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\tv-alignment=\"fill\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"fill\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<border \n" +
                "\t\t\t\n" +
                "\t\t\t title= \"لیست مدارک\" \n" +
                "\t\t/>\n" +
                "\t\t\n" +
                "\n" +
                "\t\t<children>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t<checkbox-group \n" +
                "\t\t value= \"#{documentList}\" \n" +
                "\t\t\n" +
                " name= \"Checkbox.includeDocList\" \t\t enabled= \"true\" \t\t\t\n" +
                "\t\t>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t<layout>\n" +
                "\t   \t\t<grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"7\" margin-width=\"5\" margin-height=\"5\" horizontal-spacing=\"15\" vertical-spacing=\"5\"\n" +
                "\t   \t\t/>\n" +
                "\t</layout>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\tv-alignment=\"fill\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"fill\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t\tv-hint=\"0\" \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<items \n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\tvar= \"d\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\tvalue= \"#{this.getPublicCtegoryItems('DocumentType')}\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t>\n" +
                "\t\t\t\n" +
                "\t\t\t<checkbox \n" +
                "\t\t\t\t value= \"#{d}\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t label= \"#{d.Title}\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\th-alignment=\"center\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<validators>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t</validators>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<events>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t</events>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t\t\t</checkbox >\n" +
                "\t\t</items>\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tto-value=\"#{arg.id}\" \t\tto-object=\"#{daf.findEntityById('ir.ito.common.PublicCategory',arg)}\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t</checkbox-group> \n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t</children>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t</composite>\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t<composite\n" +
                "\t\t\n" +
                " name= \"CMPSupDocExportOrRefuse\" \t\t enabled= \"true\" \t\t\t\n" +
                "\t\t>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t<layout>\n" +
                "\t   \t\t<grid-layout \n" +
                "\t   \t\tnumber-of-columns=\"2\" margin-width=\"0\" margin-height=\"5\" horizontal-spacing=\"5\" vertical-spacing=\"5\"\n" +
                "\t   \t\t/>\n" +
                "\t</layout>\n" +
                "\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\tv-alignment=\"fill\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"fill\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t<children>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t<button\n" +
                "\t\t action= \"none\"  \n" +
                "\t\t\n" +
                "\t\t caption= \"Label.Register\" \n" +
                "\t\t icon-url= \"/epic-web/Icons/add.png\" \n" +
                "\t\t icon-width= \"18\"\n" +
                "\t\t icon-height= \"18\"\n" +
                "\t\t\n" +
                " name= \"BTN_SupDoclRegister\" \t\t enabled= \"true\" \t\t label= \"Label.Register\" \t\n" +
                "\t\t>\n" +
                "\t\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-click \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{\n" +
                "println( 'documentList1111111 ::::::::::::::::: ' + documentList);\n" +
                "  if( documentList.size() &gt;0 ){\n" +
                "  println( 'documentList22222222 ::::::::::::::::: ' + documentList);\n" +
                "    a = this.insertIntoFacilityDocument(documentList , facilityIncludedId);\n" +
                "    facilityIncludedId=a.id;\n" +
                "    window.alert('با موفقيت ثبت گرديد');\n" +
                "    closeWindowId='true';\n" +
                "   }\n" +
                "  else{\n" +
                "  println( 'documentList3333333 ::::::::::::::::: ' + documentList);\n" +
                "    window.alert('ليست مدارک خالي مي باشد.');\n" +
                "    closeWindowId='false';\n" +
                "   }\n" +
                "}\n" +
                "\n" +
                "\"\n" +
                "\t  submit-region=\"facilityIncludedIdHiden,CMPIncludeDocList ,closeWindowIdHidden\"\n" +
                "\tname=\"event_36409\" \n" +
                "\tre-render=\"   closeWindowIdHidden\" \n" +
                "\t\n" +
                "\t\n" +
                "\ton-success=\"if(form.closeWindowHidden.value=='true' )\n" +
                "form.IncludedDocumentForm.close();\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-click> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t</events>\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t</button>\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t<button\n" +
                "\t\t action= \"close\"  \n" +
                "\t\t\n" +
                "\t\t caption= \"Label.Cancel\" \n" +
                "\t\t icon-url= \"/epic-web/Icons/cancel.png\" \n" +
                "\t\t icon-width= \"18\"\n" +
                "\t\t icon-height= \"18\"\n" +
                "\t\t\n" +
                " name= \"BTN_SupDocFinalRefus\" \t\t enabled= \"true\" \t\t label= \"Label.Cancel\" \t\n" +
                "\t\t>\n" +
                "\t\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
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
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t</events>\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t</button>\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t</children>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t</composite>\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t</children>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t</composite>\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t\t  \t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\t\t  \t\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t \n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\t   \t\n" +
                "\t\t\t   \t\n" +
                "\t\t\t\t\t\n" +
                "\t<hidden\n" +
                "\tname=\"facilityIncludedIdHiden\" \tvalue=\"#{facilityIncludedId}\" \t>\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t</hidden>\n" +
                "\n" +
                "\t\t\t   \t\n" +
                "\t\t\t\t\t\n" +
                "\t<hidden\n" +
                "\tname=\"closeWindowIdHidden\" \tvalue=\"#{closeWindowId}\" \t>\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t</hidden>\n" +
                "\n" +
                "\t\t\t   \t\n" +
                "\t\t\t   \t</children>\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\t   \t</form>\n" +
                "\t   \t";
    }
}


