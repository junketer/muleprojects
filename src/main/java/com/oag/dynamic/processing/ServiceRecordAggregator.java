package com.oag.dynamic.processing;

import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.routing.RoutingException;
import org.mule.routing.AbstractAggregator;
import org.mule.routing.EventGroup;
import org.mule.routing.correlation.EventCorrelatorCallback;

/**
 * Aggregate records that relate to the samme service into the same object
 *  
 * @author exhibition
 *
 */
public class ServiceRecordAggregator extends AbstractAggregator implements EventCorrelatorCallback {

	@Override
	public boolean shouldAggregateEvents(EventGroup events) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MuleEvent aggregateEvents(EventGroup events) throws RoutingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventGroup createEventGroup(MuleEvent event, Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected EventCorrelatorCallback getCorrelatorCallback(
			MuleContext muleContext) {
		// TODO Auto-generated method stub
		return null;
	}


}
