package org.venkattest.model;

import java.sql.Date;

public class UtilizationImpl implements Utilization {

	public UtilizationImpl(double _capacityHours, double _creditedHours, Date _startDate, Date _endDate) {
		super();
		this._capacityHours = _capacityHours;
		this._creditedHours = _creditedHours;
		this._startDate = _startDate;
		this._endDate = _endDate;
	}

	public void setHours(double _capacityHours, double _creditedHours) {
		this._capacityHours = _capacityHours;
		this._creditedHours = _creditedHours;
	}

	public void setDates(Date _startDate, Date _endDate) {
		this._startDate = _startDate;
		this._endDate = _endDate;
	}

	double _capacityHours = DEFAULT_CAPACITY_HOURS;
	double _creditedHours = DEFAULT_CREDITED_HOURS;
	Date _startDate = DEFAULT_START_DATE;
	Date _endDate = DEFAULT_END_DATE;
	double _util = ZERO_UTILIZATION;

	protected final Long DEFAULT_EMPLOYEE_ID = 1000L;
	protected final String DEFAULT_LAST_NAME = "Doe";
	protected final String DEFAULT_FIRST_NAME = "John";
	
	@Override
	public double getUtilization() {
		return _creditedHours / _capacityHours;
	}

}
