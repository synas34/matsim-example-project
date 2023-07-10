package org.matsim.analysis;

import org.apache.commons.lang3.event.EventUtils;
import org.matsim.core.events.EventsUtils;

public class RunPersonTimesHandler {
    public static void main(String[] arg) {
        var handler = new NewPersonEventHandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);

        EventsUtils.readEvents(manager, "C:\\Users\\snasi\\IdeaProjects\\matsim-example-project\\output\\output_events.xml.gz");

    }

}
