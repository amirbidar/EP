
import Base.Form;
import WidgetJson.FormBase;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper ().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            JSONObject xmlJSONObj = XML.toJSONObject(getXmlString());
            FormBase pojo = objectMapper.readValue(xmlJSONObj.toString(), FormBase.class);
            System.out.println(pojo.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<form xmlns=\"http://www.itorbit.net/goofy/v2/form-definition\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\" name=\"TestSaeidForm\" client-side-language=\"skippy\" title=\"TestSaeidForm\" visible=\"false\" version=\"0\">\n" +
                "    <resources>\n" +
                "        <glossary name=\"OC\" />\n" +
                "    </resources>\n" +
                "    <validators>\n" +
                "        <script-validator client-side-language=\"inherit\" script=\"\" run-at=\"client\" />\n" +
                "    </validators>\n" +
                "    <layout>\n" +
                "        <grid-layout number-of-columns=\"1\" margin-width=\"0\" margin-height=\"0\" horizontal-spacing=\"0\" vertical-spacing=\"0\" />\n" +
                "    </layout>\n" +
                "    <children>\n" +
                "        <frame url=\"thisisGeneral&gt;URL\" name=\"thisisGeneral&gt;Name\" enabled=\"true\" label=\"thisisGeneral&gt;Label\" layoutable=\"true\">\n" +
                "            <layout-data>\n" +
                "                <grid-layout-data row-span=\"2\" col-span=\"1\" v-grab=\"true\" h-grab=\"false\" v-alignment=\"begin\" h-alignment=\"begin\" v-hint=\"4\" h-hint=\"3\" />\n" +
                "            </layout-data>\n" +
                "            <events>\n" +
                "                <on-load phase=\"before_update_model\" condition=\"1==1\" client-side-language=\"javascript\" action=\"#{}\" submit-region=\"thisisEvents&gt;SubmitRegion\" name=\"event_51524\" re-render=\"thisisEvents&gt;Renderer\" fire-condition=\"#{thisisEvents&gt;Callback&gt;Fire}\" before=\"#{thisisEvents&gt;Callback&gt;Before}\" on-success=\"#{thisisEvents&gt;Callback&gt;Success}\" run-at=\"client\">\n" +
                "                    <argument name=\"arg1\" value=\"val1\" />\n" +
                "                    <argument name=\"arg2\" value=\"val2\" />\n" +
                "                </on-load>\n" +
                "                <on-focus-lost phase=\"before_update_model\" condition=\"1==1\" client-side-language=\"javascript\" action=\"#{}\" submit-region=\"thisisEvents&gt;SubmitRegion\" name=\"event_51525\" re-render=\"thisisEvents&gt;Renderer\" fire-condition=\"#{thisisEvents&gt;Callback&gt;Fire}\" before=\"#{thisisEvents&gt;Callback&gt;Before}\" on-success=\"#{thisisEvents&gt;Callback&gt;Success}\" run-at=\"client\">\n" +
                "                    <argument name=\"arg1\" value=\"val1\" />\n" +
                "                    <argument name=\"arg2\" value=\"val2\" />\n" +
                "                </on-focus-lost>\n" +
                "            </events>\n" +
                "        </frame>\n" +
                "    </children>\n" +
                "</form>";
    }
}


