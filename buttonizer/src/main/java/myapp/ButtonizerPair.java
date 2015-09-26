package myapp;

/**
 * @author Artem Grebenkin <ag@nemeses.de>
 */
public class ButtonizerPair {
    private String buttonId;
    private String eventId;

    public ButtonizerPair() {}

    public ButtonizerPair(final String buttonId, final String eventId) {
        this.buttonId = buttonId;
        this.eventId = eventId;
    }

    public void setButtonId(final String buttonId) {
        this.buttonId = buttonId;
    }

    public void setEventId(final String eventId) {
        this.eventId = eventId;
    }

    public String getButtonId() {
        return buttonId;
    }

    public String getEventId() {
        return eventId;
    }

    @Override public String toString() {
        return "ButtonizerPair{" +
                "buttonId='" + buttonId + '\'' +
                ", eventId='" + eventId + '\'' +
                '}';
    }
}
