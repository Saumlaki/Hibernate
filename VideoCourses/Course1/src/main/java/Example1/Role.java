package Example1;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class Role {
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String title;

    /**Поле role класса Users связывается с таблицей role_table через класс Example1.Role
     * <many-to-one name="role" class="Example1.Role">
     * <column name="role_id" not-null="true"/>
     * </many-to-one>
     */
    @Getter
    @Setter
    private Set<Users> users;


    public Role() {
    }
}
