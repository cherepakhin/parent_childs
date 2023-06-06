package ru.perm.v.parent_childs.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupProductEntityTest {
    @Test
    void createSimple() {
        Long PARENT_ID = -1L;
        GroupProductEntity groupProduct = new GroupProductEntity(100L, "GROUP100", PARENT_ID, true);

        assertEquals(100L, groupProduct.getId());
        assertEquals("GROUP100", groupProduct.getName());
        assertEquals(PARENT_ID, groupProduct.getParentId());
    }

}