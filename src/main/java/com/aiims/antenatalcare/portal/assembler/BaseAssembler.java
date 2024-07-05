package com.aiims.antenatalcare.portal.assembler;

public interface BaseAssembler<E, D> {

	D toDto(E e);

	E toEntity(D d);

}
