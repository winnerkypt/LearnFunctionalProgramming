
package day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Text implements Comparable<Text> {
    private String content;
    private Map<String, Double> feature = new HashMap<>();

    public Text(String content) {
        this.content = content;
        if (content != null) {
                                     // white space
            String[] result = content.split("\\s+");
            Arrays.stream(result).forEach(this::counting);
        }
    }

    private void counting(String s){
        Double d = feature.get(s);
        if(d==null){
            feature.put(s,1.0);
        }else{
            feature.replace(s, d+1);
        }
    }

    public String showFeature() {
        StringJoiner sj = new StringJoiner(",","<",">");
        feature.forEach((k,f) -> sj.add(k+":"+f));
        return sj.toString();
    }
    public double computeSimilarity(String s){
        if(feature.get(s) != null) return 1.0; return 0.0;
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

    @Override
    public int compareTo(Text o) {
        return this.content.compareTo(o.content);
    }
}
