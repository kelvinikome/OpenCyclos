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
package nl.strohalm.cyclos.dao.sms;

import java.util.List;

import nl.strohalm.cyclos.dao.BaseDAO;
import nl.strohalm.cyclos.dao.InsertableDAO;
import nl.strohalm.cyclos.dao.UpdatableDAO;
import nl.strohalm.cyclos.entities.customization.fields.MemberCustomField;
import nl.strohalm.cyclos.entities.members.Member;
import nl.strohalm.cyclos.entities.sms.SmsMailing;
import nl.strohalm.cyclos.entities.sms.SmsMailingQuery;

/**
 * DAO interface for SMS mailings
 * 
 * @author luis
 */
public interface SmsMailingDAO extends BaseDAO<SmsMailing>, InsertableDAO<SmsMailing>, UpdatableDAO<SmsMailing> {

    /**
     * Populates the collection of users which should receive the given sms mailing
     */
    void assignUsersToSend(SmsMailing smsMailing, MemberCustomField smsCustomField);

    /**
     * Returns the next member to send this sms mailing to
     */
    Member nextMemberToSend(SmsMailing mailing);

    /**
     * Removes the given member from the pending collection
     */
    void removeMemberFromPending(SmsMailing smsMailing, Member member);

    /**
     * Searches for sms mailings
     */
    List<SmsMailing> search(SmsMailingQuery query);

}
