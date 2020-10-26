package Attributes.Form;

import lombok.Data;
@Data
public class ResourcesForm {
    private Glossary glossary;
}
@Data
class Glossary{
    String name;
}
