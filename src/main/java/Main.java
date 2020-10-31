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
        return "<dropdown value=\"thisisData&gt;Value\" editable=\"true\" tooltip=\"thisisGeneral&gt;ToolTip\" name=\"Combobox51549\" enabled=\"true\" label=\"thisisGeneral&gt;Label\" layoutable=\"true\">\n" +
                "            <layout-data>\n" +
                "                <grid-layout-data row-span=\"2\" col-span=\"1\" v-grab=\"true\" h-grab=\"true\" v-alignment=\"begin\" h-alignment=\"begin\" v-hint=\"4\" h-hint=\"3\" />\n" +
                "            </layout-data>\n" +
                "            <items var=\"thisisItems&gt;Variable\" value=\"thisisItems&gt;ItemsValue\" empty-item-label=\"thisisItems&gt;EmptyItemLabel\" condition=\"thisisItems&gt;Condition\">\n" +
                "                <item name=\"thisisItems&gt;Name\" value=\"thisisItems&gt;Value\" label=\"thisisItems&gt;Label\" icon=\"thisisItems&gt;Icon\">\n" +
                "                    <converter factory=\"thisisItems&gt;Convertor&gt;Factory\" to-value=\"thisisItems&gt;Convertor&gt;ToValue\" to-object=\"thisisItems&gt;Convertor&gt;ToObject\" avoid-null-values=\"true\" />\n" +
                "                </item>\n" +
                "                <item name=\"thisisItems&gt;Name\" value=\"thisisItems&gt;Value\" label=\"thisisItems&gt;Label\" icon=\"thisisItems&gt;Icon\">\n" +
                "                    <converter factory=\"thisisItems&gt;Convertor&gt;Factory\" to-value=\"thisisItems&gt;Convertor&gt;ToValue\" to-object=\"thisisItems&gt;Convertor&gt;ToObject\" avoid-null-values=\"true\" />\n" +
                "                </item>\n" +
                "            </items>\n" +
                "            <events>\n" +
                "                <on-load phase=\"after_update_model\" condition=\"1==1\" client-side-language=\"javascript\" action=\"#{thisisEvents&gt;Action}\" submit-region=\"thisisEvents&gt;SubmitRegion\" name=\"event_51556\" re-render=\"thisisEvents&gt;Renderer\" fire-condition=\"#{thisisEvents&gt;Callback&gt;Fire}\" before=\"#{thisisEvents&gt;Callback&gt;Before}\" on-success=\"#{thisisEvents&gt;Callback&gt;Success}\" run-at=\"server\">\n" +
                "                    <argument name=\"arg1\" value=\"val1\" />\n" +
                "                    <argument name=\"arg2\" value=\"val2\" />\n" +
                "                </on-load>\n" +
                "                <on-selection-change phase=\"after_update_model\" condition=\"1==1\" client-side-language=\"javascript\" action=\"#{}\" submit-region=\"thisisEvents&gt;SubmitRegion\" name=\"event_51566\" re-render=\"thisisEvents&gt;Renderer\" fire-condition=\"#{thisisEvents&gt;Callback&gt;Fire}\" before=\"#{thisisEvents&gt;Callback&gt;Before}\" on-success=\"#{thisisEvents&gt;Callback&gt;Success}\" run-at=\"server\">\n" +
                "                    <argument name=\"arg1\" value=\"val1\" />\n" +
                "                    <argument name=\"arg2\" value=\"val2\" />\n" +
                "                </on-selection-change>\n" +
                "            </events>\n" +
                "            <listeners>\n" +
                "                <phase-listener phase=\"before_update_model\" action=\"#{thisisListeners&gt;BEFORE_UPDATE_MODEL&gt;Action}\" condition=\"1==1\" />\n" +
                "                <phase-listener phase=\"after_update_model\" action=\"#{thisisListeners&gt;AFTER_UPDATE_MODEL&gt;Action}\" condition=\"1==1\" />\n" +
                "                <phase-listener phase=\"before_first_render\" action=\"#{thisisListeners&gt;BEFORE_FIRST_RENDER&gt;Action}\" condition=\"1==1\" />\n" +
                "                <phase-listener phase=\"before_render\" action=\"#{thisisListeners&gt;BEFORE_RENDER&gt;Action}\" condition=\"1==1\" />\n" +
                "            </listeners>\n" +
                "            <validators>\n" +
                "                <script-validator client-side-language=\"javascript\" script=\"thisisValidation&gt;Script\" error-message=\"thisisValidation&gt;ErrorMEssage\" run-at=\"client\" />\n" +
                "                <required-validator run-at=\"server\" />\n" +
                "                <number-validator integer=\"true\" minimum-value=\"1\" maximum-value=\"321\" include-minimum-boundry=\"true\" include-maximum-boundry=\"false\" run-at=\"client\" />\n" +
                "                <string-validator regular-expression=\"thisisValidators&gt;StringValidator&gt;RegExp\" regular-expression-error-message=\"thisisValidators&gt;StringValidator&gt;RegExpErrorMessage\" minimum-length=\"thisisValidators&gt;StringValidator&gt;MinLength\" maximum-length=\"thisisValidators&gt;StringValidator&gt;MaxLength\" run-at=\"client_and_server\" />\n" +
                "            </validators>\n" +
                "            <converter factory=\"thisisConvertor&gt;Factory\" to-value=\"thisisConvertor&gt;ToValue\" to-object=\"thisisConvertor&gt;ToOjbect\" avoid-null-values=\"true\" />\n" +
                "        </dropdown>";
    }
}


