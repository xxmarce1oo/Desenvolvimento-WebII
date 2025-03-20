import { TestBed } from '@angular/core/testing';

import { Aula1Service } from './aula1.service';

describe('Aula1Service', () => {
  let service: Aula1Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Aula1Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
