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
        return "<radio-group value=\"#{thisisData&gt;Value}\" name=\"Radio49820\" enabled=\"true\" label=\"thisisGeneral&gt;Label\" layoutable=\"true\">\n" +
                "            <layout>\n" +
                "                <grid-layout number-of-columns=\"1\" margin-width=\"2\" margin-height=\"3\" horizontal-spacing=\"4\" vertical-spacing=\"5\" />\n" +
                "            </layout>\n" +
                "            <layout-data>\n" +
                "                <grid-layout-data row-span=\"2\" col-span=\"1\" v-grab=\"true\" h-grab=\"true\" v-alignment=\"begin\" h-alignment=\"begin\" v-hint=\"4\" h-hint=\"3\" />\n" +
                "            </layout-data>\n" +
                "            <validators>\n" +
                "                <script-validator client-side-language=\"skippy\" script=\"#{thisisValidatio&gt;Script}\" error-message=\"thisisValidation&gt;ErrorMessage\" run-at=\"client\" />\n" +
                "                <required-validator run-at=\"server\" />\n" +
                "                <script-validator script=\"#{thisisValidation&gt;ScriptValidator&gt;Script}\" error-message=\"thisisValidation&gt;ScriptValidator&gt;ErrorMessage\" run-at=\"client_and_server\" phase=\"before_update_model\" />\n" +
                "            </validators>\n" +
                "            <events>\n" +
                "                <on-load phase=\"after_update_model\" condition=\"1==1\" client-side-language=\"javascript\" action=\"#{thisisEvents&gt;Action}\" submit-region=\"Radio49820\" name=\"event_49821\" re-render=\"Radio49820\" fire-condition=\"#{thisisEvents&gt;Onload&gt;callBack&gt;Fire}\" before=\"#{thisisEvents&gt;Onload&gt;callBack&gt;Before}\" on-success=\"#{thisisEvents&gt;Onload&gt;callBack&gt;Success}\" run-at=\"server\">\n" +
                "                    <argument name=\"arg1\" value=\"val1\" />\n" +
                "                    <argument name=\"arg2\" value=\"val2\" />\n" +
                "                </on-load>\n" +
                "                <on-selection-change phase=\"before_update_model\" condition=\"1==1\" client-side-language=\"javascript\" action=\"#{thisisEvents&gt;OnSelectionChange&gt;Action}\" submit-region=\"Radio49820\" name=\"event_49822\" re-render=\"Radio49820\" fire-condition=\"#{thisisEvents&gt;OnSelectionChange&gt;callBack&gt;Fire}\" before=\"#{thisisEvents&gt;OnSelectionChange&gt;callBack&gt;Before}\" on-success=\"#{thisisEvents&gt;OnSelectionChange&gt;callBack&gt;Success}\" run-at=\"client\">\n" +
                "                    <argument name=\"arg1\" value=\"val1\" />\n" +
                "                    <argument name=\"arg2\" value=\"val2\" />\n" +
                "                </on-selection-change>\n" +
                "                <on-focus-lost phase=\"before_update_model\" condition=\"1==1\" client-side-language=\"javascript\" action=\"#{thisisEvents&gt;OnFocusLost&gt;Action}\" submit-region=\"Radio49820\" name=\"event_49823\" re-render=\"Radio49820\" fire-condition=\"#{thisisEvents&gt;OnFocusLost&gt;callBack&gt;Fire}\" before=\"#{thisisEvents&gt;OnFocusLost&gt;callBack&gt;Before}\" on-success=\"#{thisisEvents&gt;OnFocusLost&gt;callBack&gt;Success}\" run-at=\"server\">\n" +
                "                    <argument name=\"arg1\" value=\"val1\" />\n" +
                "                    <argument name=\"arg2\" value=\"val2\" />\n" +
                "                </on-focus-lost>\n" +
                "            </events>\n" +
                "            <listeners>\n" +
                "                <phase-listener phase=\"before_update_model\" action=\"#{thisisListeners&gt;BEFORE_UPDATE_MODEL&gt;Action}\" condition=\"1==1\" />\n" +
                "                <phase-listener phase=\"after_update_model\" action=\"#{thisisListeners&gt;AFTER_UPDATE_MODEL&gt;Action}\" condition=\"1==1\" />\n" +
                "                <phase-listener phase=\"before_first_render\" action=\"#{thisisListeners&gt;BEFORE_FIRST_RENDER&gt;Action}\" condition=\"1==1\" />\n" +
                "                <phase-listener phase=\"before_render\" action=\"#{thisisListeners&gt;BEFORE_FIRST_RENDER&gt;Action}\" condition=\"1==1\" />\n" +
                "            </listeners>\n" +
                "            <items var=\"thisisData&gt;Variable\" value=\"thisisData&gt;ItemsValue\" condition=\"1==1\"></items>\n" +
                "            <converter factory=\"thisisConvertor&gt;Factory\" to-value=\"thisisConvertor&gt;ToValue\" to-object=\"thisisConvertor&gt;ToObject\" avoid-null-values=\"true\" />\n" +
                "        </radio-group>";
    }
}


