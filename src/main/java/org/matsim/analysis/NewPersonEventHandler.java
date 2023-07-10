package org.matsim.analysis;

import org.matsim.api.core.v01.events.PersonArrivalEvent;
import org.matsim.api.core.v01.events.PersonDepartureEvent;
import org.matsim.api.core.v01.events.handler.PersonArrivalEventHandler;
import org.matsim.api.core.v01.events.handler.PersonDepartureEventHandler;

public class NewPersonEventHandler  implements PersonArrivalEventHandler, PersonDepartureEventHandler {
    @Override
    public void handleEvent(PersonArrivalEvent personArrivalEvent) {
        System.out.println( personArrivalEvent.getPersonId() + "arrives" + personArrivalEvent.getTime());
    }

    @Override
    public void handleEvent(PersonDepartureEvent personDepartureEvent) {
        System.out.println( personDepartureEvent.getPersonId() + "departs" + personDepartureEvent.getTime());
    }
}
