/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package nl.strohalm.cyclos.entities.members.brokerings;

import nl.strohalm.cyclos.entities.accounts.fees.transaction.BrokerCommission;
import nl.strohalm.cyclos.entities.members.Member;
import nl.strohalm.cyclos.utils.query.QueryParameters;

/**
 * Parameters for brokering default commission status query
 * @author Jefferson Magno
 */
public class BrokeringCommissionStatusQuery extends QueryParameters {

    private static final long serialVersionUID = 5543965627075789480L;

    private Member            broker;
    private Brokering         brokering;
    private BrokerCommission  brokerCommission;
    private boolean           onlyActive;
    private boolean           alreadyCharged;

    public Member getBroker() {
        return broker;
    }

    public BrokerCommission getBrokerCommission() {
        return brokerCommission;
    }

    public Brokering getBrokering() {
        return brokering;
    }

    public boolean isAlreadyCharged() {
        return alreadyCharged;
    }

    public boolean isOnlyActive() {
        return onlyActive;
    }

    public void setAlreadyCharged(final boolean alreadyCharged) {
        this.alreadyCharged = alreadyCharged;
    }

    public void setBroker(final Member broker) {
        this.broker = broker;
    }

    public void setBrokerCommission(final BrokerCommission brokerCommission) {
        this.brokerCommission = brokerCommission;
    }

    public void setBrokering(final Brokering brokering) {
        this.brokering = brokering;
    }

    public void setOnlyActive(final boolean onlyActive) {
        this.onlyActive = onlyActive;
    }

}
