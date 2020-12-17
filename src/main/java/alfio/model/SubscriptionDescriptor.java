/**
 * This file is part of alf.io.
 *
 * alf.io is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * alf.io is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with alf.io.  If not, see <http://www.gnu.org/licenses/>.
 */
package alfio.model;

import ch.digitalfondue.npjt.ConstructorAnnotationRowMapper.Column;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public class SubscriptionDescriptor {

    public enum SubscriptionAvailability {
        ONCE_PER_EVENT, UNLIMITED
    }

    private final long id;
    private final int maxEntries;
    private final ZonedDateTime creation;
    private final ZonedDateTime validFrom;
    private final ZonedDateTime validTo;
    private final int price;
    private final String currency;
    private final SubscriptionAvailability availability;
    private final boolean isPublic;
    private final int organizationId;

    public SubscriptionDescriptor(@Column("id") long id,
                                  @Column("max_entries") int maxEntries,
                                  @Column("creation_ts") ZonedDateTime creation,
                                  @Column("valid_from") ZonedDateTime validFrom,
                                  @Column("valid_to") ZonedDateTime validTo,
                                  @Column("price_cts") int price,
                                  @Column("currency") String currency,
                                  @Column("availability") SubscriptionAvailability availability,
                                  @Column("is_public") boolean isPublic,
                                  @Column("organization_id_fk") int organizationId) {
        this.id = id;
        this.maxEntries = maxEntries;
        this.creation = creation;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.price = price;
        this.currency = currency;
        this.availability = availability;
        this.isPublic = isPublic;
        this.organizationId = organizationId;
    }
}