package com.shubh.uber.backend.project.uber.services.Implementations;

import com.shubh.uber.backend.project.uber.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        //TODO        Call the third party api called OSRM to fetch the distance
        return 0;
    }
}
