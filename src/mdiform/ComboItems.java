/*
 *  ComboBox with Items Value and key
 * 
 */
package mdiform;

/**
 *
 * @author Usuario
 */
public class ComboItems {

    private String key;
    private String value;

    public ComboItems(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
