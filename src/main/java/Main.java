
import Base.Form;
import WidgetJson.FormBase;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.json.JSONObject;
import org.json.XML;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper ();
            JSONObject xmlJSONObj = XML.toJSONObject(getXmlString());
            FormBase pojo = objectMapper.readValue(xmlJSONObj.toString(), FormBase.class);
            System.out.println(pojo.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\t   \t\t\t<form xmlns=\"http://www.itorbit.net/goofy/v2/form-definition\"\n" +
                "\t\t\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "\t   \t\t\tname=\"TestForm2\"\n" +
                "\t   \t\t\tclient-side-language=\"skippy\"\n" +
                "\t   \t\t\ttitle=\"TestForm2\" \t   \t\t\t\n" +
                "\t   \t\t\tvisible=\"false\" \t   \t\t\tlayoutable=\"true\" \t   \t\t\tenabled=\"true\" \t   \t\t\trendered=\"true\" \t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\t\t   \t\t\tresizable=\"false\" \t   \t\t\tdraggable=\"true\" \t   \t\t\t\n" +
                "\t   \t\t\tversion=\"1\" \n" +
                "\t   \t\t\t>\n" +
                "\n" +
                "\t\t\t\t<resources>\n" +
                "\t\t\t\t\t<glossary name=\"MyReports\"/>\n" +
                "\t\t\t\t</resources>\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\n" +
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
                "\t\t\tvalue= \"value\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tdefault-widget= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\ttooltip= \"tooltip\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"20\" \t\t\t\n" +
                "\t\t\n" +
                "\t\tdirection= \"rtl\" \t\t\t\n" +
                "\t\tformatNumber= \"true\"\n" +
                "\t\t\n" +
                " name= \"TextField_3652\" \t\t enabled= \"true\" \t\t label= \"label\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"19\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"16\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"true\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"true\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"begin\" \n" +
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
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\tscript=\"Script\"\n" +
                "\t\terror-message=\"error\" \n" +
                "\t\trun-at= \"server\"\n" +
                "\t\t\n" +
                "\t/>\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t<required-validator \n" +
                "\t\trun-at= \"server\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t<number-validator \n" +
                "\t\tinteger=\"true\"\n" +
                "\t\tminimum-value=\"10\" \n" +
                "\t\tmaximum-value=\"20\" \n" +
                "\t\tinclude-minimum-boundry=\"true\"\n" +
                "\t\tinclude-maximum-boundry=\"true\"\n" +
                "\t\trun-at= \"server\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t<string-validator \n" +
                "\t\tregular-expression=\"regex\" \n" +
                "\t\tregular-expression-error-message=\"errorregex\" \n" +
                "\t\tminimum-length=\"10\" \n" +
                "\t\tmaximum-length=\"20\" \n" +
                "\t\trun-at= \"client\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t<email-validator \n" +
                "\t\trun-at= \"client_and_server\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"condition\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{action}\"\n" +
                "\t  submit-region=\"region\"\n" +
                "\tname=\"event_3673\" \n" +
                "\tre-render=\"render\" \n" +
                "\tfire-condition=\"fire\" \n" +
                "\tbefore=\"before\" \n" +
                "\ton-success=\"success\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"asdsad\" value=\"asdas\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"asdasd\" value=\"cdcdcd\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"asdasd\" value=\"fgfbgb\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"condition\t\" \n" +
                "\tclient-side-language= \"skippy\"\n" +
                "\taction=\"#{asdasdasdasdasd}\"\n" +
                "\t  submit-region=\"region\"\n" +
                "\tname=\"event_3674\" \n" +
                "\tre-render=\"render\" \n" +
                "\tfire-condition=\"fire\" \n" +
                "\tbefore=\"before\" \n" +
                "\ton-success=\"success\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"amir\" value=\"amir\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"amir\" value=\"asdasdasdasda\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"asdasdasdasda\" value=\"asdasdasdasda\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"asdasdasdasda\" value=\"asdasdasdasda\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-change> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-edit\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"asdasdasdasda\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{asdasdasdasda}\"\n" +
                "\t  submit-region=\"region\"\n" +
                "\tname=\"event_3675\" \n" +
                "\tre-render=\"render\" \n" +
                "\tfire-condition=\"asdasdasdasda\" \n" +
                "\tbefore=\"asdasdasdasda\" \n" +
                "\ton-success=\"asdasdasdasda\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"asdasdasdasda\" value=\"asdasdasdasda\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"asdasdasdasda\" value=\"asdasdasdasda\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"asdasdasdasda\" value=\"asdasdasdasda\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-edit>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-select \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{action}\"\n" +
                "\t  submit-region=\"region\"\n" +
                "\tname=\"event_3676\" \n" +
                "\tre-render=\"render\" \n" +
                "\tfire-condition=\"fire\" \n" +
                "\tbefore=\"asdasdasdasda\" \n" +
                "\ton-success=\"success\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"asdsad\" value=\"vdvdf\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"asdsa\" value=\"gfdgsd\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\" acasc\" value=\"sadasdas\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-select> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-deselect \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"condition\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{action}\"\n" +
                "\t  submit-region=\"region\"\n" +
                "\tname=\"event_3677\" \n" +
                "\tre-render=\"render\" \n" +
                "\tfire-condition=\"fire\" \n" +
                "\tbefore=\"before\" \n" +
                "\ton-success=\"success\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"amir\" value=\"bidar\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"amir\" value=\"bidar\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-deselect> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-focus-lost\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"condition\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{sdsdaasdasdas}\"\n" +
                "\t  submit-region=\"region\"\n" +
                "\tname=\"event_3678\" \n" +
                "\tre-render=\"render\" \n" +
                "\tfire-condition=\"fire\" \n" +
                "\tbefore=\"before\" \n" +
                "\ton-success=\"success\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"amir\" value=\"bidar\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"bidar\" value=\"amir\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-focus-lost>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\t   \t\t<listeners>\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\taction=\"#{asdasdasdasda}\"\n" +
                "\t\tcondition=\"thiscondition\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{asdasdasdasda}\"\n" +
                "\t\tcondition=\"thiscondition\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{adffvvbfbgnhn}\"\n" +
                "\t\tcondition=\"thiscondition\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{fsdxvvrfrveadasdbgtnhmhy}\"\n" +
                "\t\tcondition=\"thiscondition\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "   \t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"factory\" \t\tto-value=\"String\" \t\tto-object=\"String\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
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
                "\t\t\t   \t\n" +
                "\t\t\t   \t\n" +
                "\t\t\t   \t</children>\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t\t\t   \t</form>\n" +
                "\t   \t";
    }
}


