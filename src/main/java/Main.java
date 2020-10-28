import Widgets.dropdown;
import Widgets.grid;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.json.JSONObject;
import org.json.XML;

public class Main {

    public static void main(String[] args) {
        try {
            /*XmlMapper xmlMapper = new XmlMapper();
            grid pojo = xmlMapper.readValue(getXmlString(), grid.class);*/
            JSONObject xmlJSONObj = XML.toJSONObject(getXmlString());
            System.out.println(xmlJSONObj.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "\n" +
                "\t\t\n" +
                "\t\t<editable-grid\n" +
                "\t\t factory= \"true\" \n" +
                "\t\t find-expression= \"true\" \n" +
                "\t\t delete-expression= \"true\" \n" +
                "\t\t value= \"#{unit.id}\" \n" +
                "\t\tshow-side-buttons= \"true\"\n" +
                "\t\tshow-add-button= \"true\"\n" +
                "\t\tshow-delete-button= \"true\"\n" +
                "\t\tselection-mode= \"multiple\"\n" +
                "\t\tmaximum-rows= \"5\"\n" +
                "\t\t\n" +
                " name= \"table_2921\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
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
                "\t\t\tv-grab=\"true\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"true\" \n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8799\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-click \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8800\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-click> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-double-click \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8801\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-double-click> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-selection-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8802\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-selection-change> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-row-action\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8803\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-row-action>\n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8804\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-focus-lost>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t</events>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t   \t\t<listeners>\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "   \t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<columns>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2922\" \n" +
                "\t\t\t header= \"Header_2923\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"begin\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t<textfield\n" +
                "\t\t\n" +
                "\t\t\tvalue= \"#{unit.id}\" \t\t\t\n" +
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
                " name= \"TextField_2970\" \t\t enabled= \"true\" \t\t label= \"label\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\tscript=\"true\"\n" +
                "\t\terror-message=\"true\" \n" +
                "\t\trun-at= \"client_and_server\"\n" +
                "\t\tphase= \"after_update_model\" \n" +
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
                "\t\trun-at= \"client\"\n" +
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
                "\t\tregular-expression=\"true\" \n" +
                "\t\tregular-expression-error-message=\"true\" \n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_3000\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_3001\" \n" +
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
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_3002\" \n" +
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
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_3003\" \n" +
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
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_3004\" \n" +
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
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_3005\" \n" +
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
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t</textfield>\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2926\" \n" +
                "\t\t\t header= \"Header_2927\" \n" +
                "\t\t\t icon= \"true\" \n" +
                "\t\t\t visible= \"true\" \n" +
                "\t\t\t color= \"true\" \n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"center\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "<textarea\n" +
                "\t\t\n" +
                "\t\t\tvalue= \"#{unit.id}\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tdefault-widget= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\ttooltip= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"200\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\thtml-enabled= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\tdirection= \"ltr\"\n" +
                "\t\t\n" +
                " name= \"TextArea_3379\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\tscript=\"true\"\n" +
                "\t\terror-message=\"true\" \n" +
                "\t\trun-at= \"server\"\n" +
                "\t\tphase= \"after_update_model\" \n" +
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
                "\t\trun-at= \"client\"\n" +
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
                "\t\tregular-expression=\"true\" \n" +
                "\t\tregular-expression-error-message=\"true\" \n" +
                "\t\tminimum-length=\"20\" \n" +
                "\t\tmaximum-length=\"30\" \n" +
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
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-edit\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_3391\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-edit>\n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_3392\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-change> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_3393\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_4354\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_4541\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-deselect> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t</textarea>\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2930\" \n" +
                "\t\t\t header= \"Header_2931\" \n" +
                "\t\t\t icon= \"true\" \n" +
                "\t\t\t visible= \"true\" \n" +
                "\t\t\t color= \"true\" \n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"end\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t<password-field\n" +
                "\t\t\n" +
                "\t\t\tvalue= \"#{unit.id}\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\treadonly= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tdefault-widget= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\ttooltip= \"true\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\tmax-length= \"0\" \t\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"Password4733\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\tscript=\"true\"\n" +
                "\t\terror-message=\"true\" \n" +
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
                "\t\trun-at= \"client\"\n" +
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
                "\t\tregular-expression=\"true\" \n" +
                "\t\tregular-expression-error-message=\"true\" \n" +
                "\t\tminimum-length=\"true\" \n" +
                "\t\tmaximum-length=\"true\" \n" +
                "\t\trun-at= \"server\"\n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"skippy\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_4943\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_4944\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-change> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_4945\" \n" +
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
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_4946\" \n" +
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
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_4947\" \n" +
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
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\t</password-field>\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2934\" \n" +
                "\t\t\t header= \"Header_2935\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"begin\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\n" +
                "\t\t<datepicker\n" +
                "\t\tmode= \"date\"\n" +
                "\t\t value= \"true\" \n" +
                "\t\t readonly= \"false\" \n" +
                "\t\t tooltip= \"true\" \n" +
                "\t\t calendarMode = \"jalali\"\n" +
                "\t\t \n" +
                "\t\t\n" +
                " name= \"DatePicker5168\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
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
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t<date-range-validator \n" +
                "\t\tminimum-value=\"10\" \n" +
                "\t\tmaximum-value=\"20\" \n" +
                "\t\trun-at= \"server\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_5175\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
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
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "   \t\t\n" +
                "\t\n" +
                "\t\t</datepicker>\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2938\" \n" +
                "\t\t\t header= \"Header_2939\" \n" +
                "\t\t\t icon= \"true\" \n" +
                "\t\t\t visible= \"true\" \n" +
                "\t\t\t color= \"true\" \n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"center\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\n" +
                "\t\t<dropdown \n" +
                "\t\t value =\"#{unit.id}\" \n" +
                "\t\t editable =\"true\" \n" +
                "\t\t tooltip =\"true\" \n" +
                "\t\t\n" +
                " name= \"Combobox5616\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<items \n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t>\n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t</items>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
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
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "   \t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t</dropdown>\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2942\" \n" +
                "\t\t\t header= \"Header_2943\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"begin\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                " \n" +
                "\t\t<dropdown \n" +
                "\t\t value =\"#{unit.id}\" \n" +
                "\t\t editable =\"true\" \n" +
                "\t\t tooltip =\"true\"  \n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"Combobox5863\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<items\n" +
                "\t\t var= \"true\" \n" +
                "\t\t value= \"true\" \n" +
                "\t\t empty-item-label= \"true\" \n" +
                "\t\t condition= \"true\" \n" +
                "\t\t>\n" +
                "\t\t\t<item\n" +
                "\t\t\t name = \"true\" \n" +
                "\t\t\t value = \"#{unit.id}\" \n" +
                "\t\t\t label = \"true\" \n" +
                "\t\t\t icon = \"true\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t</item>\n" +
                "\t\t</items>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-selection-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_5868\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-selection-change> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_5869\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
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
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "   \t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\t\tclient-side-language= \"inherit\"\n" +
                "\t\tscript=\"true\"\n" +
                "\t\terror-message=\"true\" \n" +
                "\t\trun-at= \"client\"\n" +
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
                "\t\trun-at= \"client\"\n" +
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
                "\t\trun-at= \"client\"\n" +
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
                "\t\tregular-expression=\"true\" \n" +
                "\t\tregular-expression-error-message=\"true\" \n" +
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
                "\t\trun-at= \"client\"\n" +
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
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t</dropdown>\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2946\" \n" +
                "\t\t\t header= \"Header_2947\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"begin\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t<checkbox-group \n" +
                "\t\t value= \"#{unit.id}\" \n" +
                "\t\t\n" +
                " name= \"Checkbox6111\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
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
                "\t   \t\tnumber-of-columns=\"2\" margin-width=\"5\" margin-height=\"5\" horizontal-spacing=\"5\" vertical-spacing=\"5\"\n" +
                "\t   \t\t/>\n" +
                "\t</layout>\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\tscript=\"true\"\n" +
                "\t\terror-message=\"true\" \n" +
                "\t\trun-at= \"server\"\n" +
                "\t\tphase= \"after_update_model\" \n" +
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
                "\t\t</validators>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_6437\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\t\n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-selection-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_6438\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-selection-change> \n" +
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
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "   \t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<items \n" +
                "\t\t var= \"true\" \n" +
                "\t\t value= \"true\" \n" +
                "\t\t condition= \"true\" \n" +
                "\t\t>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t<checkbox\n" +
                "\t\t value= \"true\" \n" +
                "\t\t selected= \"false\" \n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"checkItem6197\" \t\t enabled= \"true\" \t\t label= \"true\" \t\n" +
                "\t\t>\n" +
                "\t\t\t\n" +
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
                "\t\t\tv-alignment=\"begin\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"begin\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<validators>\n" +
                "\t\t\t\n" +
                "\t\t\t</validators>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<events>\n" +
                "\t\t\t\n" +
                "\t\t\t\t\t</events>\n" +
                "\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t</checkbox>\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t<checkbox\n" +
                "\t\t value= \"true\" \n" +
                "\t\t selected= \"false\" \n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"checkItem6198\" \t\t enabled= \"true\" \t\t label= \"true\" \t\n" +
                "\t\t>\n" +
                "\t\t\t\n" +
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
                "\t\t\tv-alignment=\"begin\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"begin\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<validators>\n" +
                "\t\t\t\n" +
                "\t\t\t</validators>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<events>\n" +
                "\t\t\t\n" +
                "\t\t\t\t\t</events>\n" +
                "\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t</checkbox>\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\t<checkbox\n" +
                "\t\t value= \"true\" \n" +
                "\t\t selected= \"false\" \n" +
                "\t\t\n" +
                "\t\t\n" +
                " name= \"checkItem6199\" \t\t enabled= \"true\" \t\t label= \"true\" \t\n" +
                "\t\t>\n" +
                "\t\t\t\n" +
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
                "\t\t\tv-alignment=\"begin\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"begin\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<validators>\n" +
                "\t\t\t\n" +
                "\t\t\t</validators>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<events>\n" +
                "\t\t\t\n" +
                "\t\t\t\t\t</events>\n" +
                "\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t</checkbox>\n" +
                "\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t</items>\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t</checkbox-group> \n" +
                "\t\t \n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2950\" \n" +
                "\t\t\t header= \"Header_2951\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"begin\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t<checkbox-group \n" +
                "\t\t value= \"#{unit.id}\" \n" +
                "\t\t\n" +
                " name= \"Checkbox6942\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
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
                "\t\t</validators>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_7217\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-selection-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_7218\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-selection-change> \n" +
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
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "   \t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<items \n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\tvar= \"true\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\tvalue= \"true\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\tcondition= \"true\" \n" +
                "\t\t\t\n" +
                "\t\t>\n" +
                "\t\t\t\n" +
                "\t\t\t<checkbox \n" +
                "\t\t\t\t value= \"true\" \n" +
                "\t\t\t\t selected= \"true\" \n" +
                "\t\t\t\t tooltip= \"true\" \n" +
                "\t\t\t\t visible= \"true\" \n" +
                "\t\t\t\t layoutable= \"true\" \n" +
                "\t\t\t\t enabled= \"true\" \n" +
                "\t\t\t\t name= \"true\" \n" +
                "\t\t\t\t rendered= \"true\" \n" +
                "\t\t\t\t label= \"true\" \n" +
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
                "\t\t\tv-alignment=\"begin\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"begin\"\n" +
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
                "\t\t\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\t\tclient-side-language= \"inherit\"\n" +
                "\t\tscript=\"\"\n" +
                "\t\t\n" +
                "\t\trun-at= \"client\"\n" +
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
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
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
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
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
                "\t<selection-validator \n" +
                "\t\tminimum-selection=\"10\" \n" +
                "\t\tmaximum-selection=\"20\" \n" +
                "\t\trun-at= \"server\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t</validators>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t<events>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_6945\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\n" +
                "\t <on-selection-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_6946\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"truetrue\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-selection-change> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\n" +
                "\t <on-select \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_6947\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-select> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\n" +
                "\t <on-deselect \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_6948\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-deselect> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t</events>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t   \t\t<listeners>\n" +
                "\t\t\t   \t\t\n" +
                "\t\t\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\taction=\"#{}\"\n" +
                "\t\t/>\n" +
                "\n" +
                "\t\t\t   \t\t\n" +
                "\t\t\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\taction=\"#{}\"\n" +
                "\t\t/>\n" +
                "\n" +
                "\t\t\t   \t\t\n" +
                "\t\t\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\taction=\"#{}\"\n" +
                "\t\t/>\n" +
                "\n" +
                "\t\t\t   \t\t\n" +
                "\t\t\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\taction=\"#{}\"\n" +
                "\t\t/>\n" +
                "\n" +
                "\t\t\t   \t\t\n" +
                "\t\t\t   \t\t</listeners>\n" +
                "\t\t   \t\t\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t\t\t</checkbox >\n" +
                "\t\t</items>\n" +
                "\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t</checkbox-group> \n" +
                "\t\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2954\" \n" +
                "\t\t\t header= \"Header_2955\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"begin\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\n" +
                "\t<checkbox\n" +
                "\t\t value= \"#{unit.id}\" \n" +
                "\t\t selected= \"false\" \n" +
                "\t\t tooltip= \"true\" \n" +
                "\t\t\n" +
                " name= \"checkItem7768\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<validators>\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\tscript=\"true\"\n" +
                "\t\terror-message=\"true\" \n" +
                "\t\trun-at= \"client_and_server\"\n" +
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
                "\t\t\t\n" +
                "\t\t\t\t\n" +
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
                "\t\t\t\n" +
                "\t\t\t</validators>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<events>\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_7769\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\t <on-selection-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_7770\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-selection-change> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\t <on-select \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}true\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_7771\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-select> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\t <on-deselect \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_7772\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-deselect> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\t\t</events>\n" +
                "\t\n" +
                "\t\t\t\t\t\n" +
                "\t   \t\t<listeners>\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "\t   \t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t</checkbox>\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t\t<column\n" +
                "\t\t\t name= \"Name_2958\" \n" +
                "\t\t\t header= \"Header_2959\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\twidth= \"80\"\n" +
                "\t\t\talignment= \"begin\" \n" +
                "\t\t\ttype= \"string\"   \n" +
                "\t\t\t>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t <cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\n" +
                "\n" +
                "<radio\n" +
                "\t value= \"#{unit.id}\" \n" +
                "\t\n" +
                " name= \"Name8070\" \t\t enabled= \"true\" \t\t label= \"true\" \t layoutable= \"true\" \n" +
                "\t>\n" +
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
                "\t\t\tv-alignment=\"begin\" \n" +
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
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\tscript=\"true\"\n" +
                "\t\terror-message=\"true\" \n" +
                "\t\trun-at= \"server\"\n" +
                "\t\tphase= \"after_update_model\" \n" +
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
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8072\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-selection-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8073\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-selection-change> \n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8074\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
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
                "\t\tphase=\"before_update_model\"\n" +
                "\t\n" +
                "\tcondition=\"truetrue\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8075\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
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
                "\tcondition=\"true\" \n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{true}\"\n" +
                "\t  submit-region=\"true\"\n" +
                "\tname=\"event_8076\" \n" +
                "\tre-render=\"true\" \n" +
                "\tfire-condition=\"true\" \n" +
                "\tbefore=\"true\" \n" +
                "\ton-success=\"true\" \n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\t<argument name=\"true\" value=\"true\"/>\n" +
                "\t\n" +
                "\t\n" +
                "\t </on-focus-lost>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\t\t</events>\n" +
                "\t\n" +
                "\t\t\t\t\t\n" +
                "\t   \t\t<listeners>\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_first_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"before_render\"\n" +
                "\t\taction=\"#{true}\"\n" +
                "\t\tcondition=\"true\" \t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "\t\t\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "</radio>\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t \n" +
                "\t\t\t\t </cell-editor>\n" +
                "\t\t\t\t \n" +
                "\t\t\t</column>\n" +
                "\t\t\n" +
                "\t\t</columns>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<data \n" +
                "\t\t var= \"true\" \n" +
                "\t\t value= \"true\" \n" +
                "\t\t condition= \"true\" \n" +
                "\t\t>\n" +
                "\t\t\t\n" +
                "\t<entity\n" +
                "\t name= \"true\" \n" +
                "\t id= \"true\" \n" +
                "\t label= \"true\" \n" +
                "\t value= \"#{unit.id}\" \n" +
                "\t editable= \"true\" \n" +
                "\t\n" +
                "\t\n" +
                "\t>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2922\" \n" +
                "\t\t\t value= \"Value_2925\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2926\" \n" +
                "\t\t\t value= \"Value_2929\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2930\" \n" +
                "\t\t\t value= \"Value_2933\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2934\" \n" +
                "\t\t\t value= \"Value_2937\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2938\" \n" +
                "\t\t\t value= \"Value_2941\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2942\" \n" +
                "\t\t\t value= \"Value_2945\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2946\" \n" +
                "\t\t\t value= \"Value_2949\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2950\" \n" +
                "\t\t\t value= \"Value_2953\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2954\" \n" +
                "\t\t\t value= \"Value_2957\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2958\" \n" +
                "\t\t\t value= \"Value_2961\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2962\" \n" +
                "\t\t\t value= \"Value_2965\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t\t\t<property\n" +
                "\t\t\t name= \"Name_2966\" \n" +
                "\t\t\t value= \"Value_2969\" \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</property>\n" +
                "\t\t\n" +
                "\t</entity>\n" +
                "\n" +
                "\t\t</data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"true\" \t\tto-value=\"true\" \t\tto-object=\"true\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\t\t</editable-grid>\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t";
    }
}


