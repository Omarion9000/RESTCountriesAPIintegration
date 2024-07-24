package org.example.week11;

import java.util.List;
import java.util.Map;

public class CountryResponse {
    private Name name;
    private List<String> capital;
    private List<String> borders;
    private Map<String, String> languages;

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public List<String> getCapital() { return capital; }
    public void setCapital(List<String> capital) { this.capital = capital; }

    public List<String> getBorders() { return borders; }
    public void setBorders(List<String> borders) { this.borders = borders; }

    public Map<String, String> getLanguages() { return languages; }
    public void setLanguages(Map<String, String> languages) { this.languages = languages; }

    public static class Name {
        private String common;
        private String official;

        public String getCommon() { return common; }
        public void setCommon(String common) { this.common = common; }

        public String getOfficial() { return official; }
        public void setOfficial(String official) { this.official = official; }
    }
}
