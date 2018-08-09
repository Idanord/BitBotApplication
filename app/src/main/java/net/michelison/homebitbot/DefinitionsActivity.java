package net.michelison.homebitbot;

public class DefinitionsActivity {

    private int DefinitionID;
    private String Definition;
    private int TermFKID;

    public int getDefinitionID() {
        return DefinitionID;
    }

    public void setDefinitionID(int definitionID) {
        DefinitionID = definitionID;
    }

    public String getDefinition() {
        return Definition;
    }

    public void setDefinition(String definition) {
        Definition = definition;
    }

    public int getTermFKID() {
        return TermFKID;
    }

    public void setTermFKID(int termFKID) {
        TermFKID = termFKID;
    }
}
