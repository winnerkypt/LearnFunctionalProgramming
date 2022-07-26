
package day1;

import java.util.Map;

public class Text {
    private String content;
    private Map<String,Double> feature;

    public Text(String content) {
        this.content = content;
        this.feature = null;
    }

    @Override
    public String toString() {
        return "Text{" + "content=" + content + ", feature=" + feature + '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, Double> getFeature() {
        return feature;
    }

    public void setFeature(Map<String, Double> feature) {
        this.feature = feature;
    }
}
