/*
   This file is part of Cyclos.

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
package nl.strohalm.cyclos.controls.admins;

import nl.strohalm.cyclos.controls.elements.RemoveElementForm;

/**
 * Form used to remove an admin
 * @author luis
 */
public class RemoveAdminForm extends RemoveElementForm {
    private static final long serialVersionUID = -5685043060964974792L;

    public long getAdminId() {
        return getElementId();
    }

    public void setAdminId(final long memberId) {
        setElementId(memberId);
    }
}
