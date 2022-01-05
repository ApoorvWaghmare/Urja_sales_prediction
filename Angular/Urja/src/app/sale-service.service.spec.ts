import { TestBed } from '@angular/core/testing';

import { SaleServiceService } from './sale-service.service';

describe('SaleServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SaleServiceService = TestBed.get(SaleServiceService);
    expect(service).toBeTruthy();
  });
});
