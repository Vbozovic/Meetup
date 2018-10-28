package app.display;

import java.util.Collection;

public abstract class Display {

    protected Collection<?> toDisplay;

    public Display() {
    }

    public Display(Collection<?> toDisplay) {
        this.toDisplay = toDisplay;
    }

    public abstract void doDisplay();
    public abstract void undoDisplay();

    public void setToDisplay(Collection<?> toDisplay) {
        this.toDisplay = toDisplay;
    }
}
