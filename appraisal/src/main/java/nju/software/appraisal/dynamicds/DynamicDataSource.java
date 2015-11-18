package nju.software.appraisal.dynamicds;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 * @author YZJ
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineCurrentLookupKey()
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return CustomerContextHolder.getCustomerType();
	}

}
