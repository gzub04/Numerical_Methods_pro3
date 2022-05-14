function [t, x] = AdamPC(h)
    t = 0:h:15; % t axis with interval [0, 15] and step of size h
    B_explicit = [1901, -2774, 2616, -1274, 251] / 720;       % for k = 5
    B_implicit = [475, 1427, -798, 482, -173, 27] / 1440;   % for k = 5
    [~, x] = RK4(h, 4*h);   
    % 4*h because we want RK4 to calculate 4 prev. values, giving us in
    % total 5 values (including given x_0), so now x(5, :) contains x_4

    for n = 5 : (length(t) - 1)
        % calculating sum sign, from j=1 to k=5
        prediction = 0;
        for j = 1 : 5
            prediction = prediction + B_explicit(j) * func2(x(n+1-j, :));
            % (n+1) instead of n because the array number doesn't allign with x index
        end
        % x_n = x_n-1 + h * sum
        prediction = x(n, :) + h * prediction;

        % calculating sum sign, from j=1 to k=5
        correction = 0;
        for j = 1 : 5
            % because B_implicit starts at B_0, we have to add 1
            correction = correction + B_implicit(j+1) * func2(x(n+1-j, :));
        end
        % add new x's to the x array
        x(n+1, :) = x(n, :) + h * correction + h*B_implicit(1)*func2(prediction);
    end
end
